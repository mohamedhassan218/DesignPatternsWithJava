import java.net.*;
import java.awt.*;
import javax.swing.*;

// The ImageProxy implements the Icon interface.
class ImageProxy implements Icon {
	
	// ImageIcon is the RealIcon that we want to display when it's loaded.
	volatile ImageIcon imageIcon;
	
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
    
	/*
     * We pass the URL of the image into the constructor. This is the image we need 
	 * to display once it's loaded.
	 * */
	public ImageProxy(URL url) { imageURL = url; }
     
	public int getIconWidth() {
		if (imageIcon != null) {
            return imageIcon.getIconWidth(); // Return default width until the imageicon is loaded.
        } else {
			return 800;
		}
	}
 
	public int getIconHeight() {
		if (imageIcon != null) {
            return imageIcon.getIconHeight(); // Return default height until the imageicon is loaded.
        } else {
			return 600;
		}
	}
	
	/*
	 * ImageIcon is used by two different threads, so along with making 
	 * the variable volatile (to protect reads), 
	 * we use a synchronized setter (to protect writes).
	 * */
	synchronized void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
    
	// This method is called when it's time to paint the icon on the screen.
	public void paintIcon(final Component c, Graphics  g, int x,  int y) {
		if (imageIcon != null) {
			// If we've got an icon already, we go ahead and tell it to paint itself.
			imageIcon.paintIcon(c, g, x, y);
		} else {
			// Otherwise, we display the 'loading' message.
			g.drawString("Loading album cover, please wait...", x+300, y+190);
			// If we're not already trying to retrieve the image...
			if (!retrieving) {
				// then it's time to start retrieving it.
				retrieving = true;
				
				// We don't want to hang up the entire user interface, so we're
				// going to use another thread to retrieve the image.
				retrievalThread = new Thread(new Runnable() {
					/*
					 *Here's where we load the REAL icon image.
					 *Note that that image loading with IconImage is synchronous:
					 *the ImageIcon constructor doesn't return until the image is loaded.
					 *That doesn't give us much of a chance to do screen updates and have our 
					 *message displayed, so we're going to do this asynchronously.
					 **/
					public void run() {
						try {
							setImageIcon(new ImageIcon(imageURL, "Album Cover"));
							c.repaint();
						}catch (Exception e) {
							/*
							 * Paint the icon on the screen (by delegating to the ImageIcon). However, 
							 * if we don't have a fully created ImageIcon, then we create one.
							 * */
							e.printStackTrace();
						}
					}
				});
				
				retrievalThread = new Thread(() -> {
						try {
							setImageIcon(new ImageIcon(imageURL, "Album Cover"));
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
				});
				retrievalThread.start();
				
			}
		}
	}
}
