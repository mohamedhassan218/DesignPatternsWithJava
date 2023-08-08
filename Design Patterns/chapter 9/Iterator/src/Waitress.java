import java.util.Iterator;

public class Waitress {
	Menu pancakeMenu;
	Menu dinnerMenu;

	// Constructor to initiate the menus objects.
	public Waitress(Menu pancakeMenu, Menu dinnerMenu) {
		this.pancakeMenu = pancakeMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	// Create Iterator of each menu and print its elements using the Iterator Pattern.
	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeMenu.createIterator();
		Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
		
		System.out.println("Pancake Menu: ");
		printMenu(pancakeIterator);
		System.out.println();
		System.out.println("Dinner Menu: ");
		printMenu(dinnerIterator);
		System.out.println();
		System.out.println("Bon Appetit Sir!");
	}
	
	// Private method used to loop over the elements using the iterator.
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println("Name: " + item.getName());
			System.out.println("Description: " + item.getDescription());
			System.out.println("Price: " + item.getPrice());
			System.out.println(" - - - - - - - - - - - - - ");
		}
	}
}
