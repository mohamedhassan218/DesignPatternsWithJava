public class BeverageTestDrive {
	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		
		System.out.println("Preparing tea . . . ");
		tea.prepareReciepe();
		System.out.println("Tea is finished\n");
		System.out.println("Preparing Coffee . . . ");
		coffee.prepareReciepe();
		System.out.println("Coffee is finished\n");
	}
}
