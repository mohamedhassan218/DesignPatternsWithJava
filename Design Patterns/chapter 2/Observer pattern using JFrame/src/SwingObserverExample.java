import java.awt.*;
import javax.swing.*;

public class SwingObserverExample {
	// This is a simple Swing application, just creates a a frame
	// and throws a button on it.
	static JFrame frame;

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();

	}

	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Should I do it?!");

		// Make the angel object a listener.
		  button.addActionListener(new AngelListener());
		  
		  //Make the devil object a listener. 
		  button.addActionListener(new DevilListener());
		 
		/******************************************************/

		// with lambda:
		button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
		button.addActionListener(event -> System.out.println("Come on, do it!"));
		frame.getContentPane().add(BorderLayout.CENTER, button);

		// Set frame properties

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
