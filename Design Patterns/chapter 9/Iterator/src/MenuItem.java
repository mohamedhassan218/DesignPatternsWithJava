public class MenuItem {
	// Item Attributes:
	String name;
	String description;
	boolean vegetarian;
	double price;
 
	public MenuItem(
			String name, 
			String description, 
			boolean vegetarian, 
			double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	// Return item's name.
	public String getName() {
		return name;
	}
  
	// Get the description of the item.
	public String getDescription() {
		return description;
	}
	
	// Return the price of the item.
	public double getPrice() {
		return price;
	}

	// Return true if the item is vegetarian.
	public boolean isVegetarian() {
		return vegetarian;
	}
}