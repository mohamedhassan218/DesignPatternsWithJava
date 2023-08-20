import java.util.ArrayList;
import java.util.Iterator;

// MenuComponent is a component that has children (called composite).
// Children may be components or leaf.
public class Menu extends MenuComponent{
	// ArrayList to hold the children of the composite object.
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
  
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// Method to add new component (child) to the composite.
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	// Method to remove specific component from the children of the current composite.
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	// Method to return specific child using its index.
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}
	
	// Method that prints the data of the composite and its all children.
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = 
				(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}