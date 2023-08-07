import java.util.Iterator;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's Pancake Breakfast", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
	 
			addItem("Regular Pancake Breakfast", 
				"Pancakes with fried eggs, sausage", 
				false,
				2.99);
	 
			addItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries, and blueberry syrup",
				true,
				3.49);
	 
			addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true,
				3.59);
	}
	
	// To add new items to the menu.
	public void addItem(
			String name, 
			String description,
			boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	// Show all items in the current menu.
	public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}
	
	// Return iterator to enable the client to iterate over the menu items.
	public Iterator<MenuItem> createIterator(){
		return menuItems.iterator();
	}	
}