import java.util.Arrays;

public class DuckSortTestDrive {
	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("Mohamed", 19),
				new Duck("Ahmed", 10),
				new Duck("Mona", 4),
				new Duck("Ali", 190),
				new Duck("Ibrahim", 3)
		};
		
		System.out.println("Before sorting: ");
		display(ducks);
		System.out.println("/////////////////////////");
		Arrays.sort(ducks);
		System.out.println("After sorting: ");
		display(ducks);
	}
	
	public static void display(Duck[] ducks) {
		for(Duck d : ducks)
			System.out.println(d);
	}
}
