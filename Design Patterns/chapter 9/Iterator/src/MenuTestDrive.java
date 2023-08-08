
public class MenuTestDrive {
	public static void main(String[] args) {

		DinnerMenu dinnerMenu = new DinnerMenu();
		PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();

		Waitress waitress = new Waitress(pancakeMenu, dinnerMenu);
		
		// Prints all possible items in each of the pancake menu and dinner menu.
		waitress.printMenu();
	}

}
