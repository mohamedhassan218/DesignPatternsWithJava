import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffineBeverage{

	public void brew() 
	{System.out.println("Dripping coffee through filter . . .");}
	
	public void addCondiments()
	{System.out.println("Adding sugar and milk . . . ");}
	
	public boolean customerWantsCondiments() {
		String result = getUserInput();
		
		if(result.toLowerCase().startsWith("y"))
			return true;
		else
			return false;
	}
	
	private String getUserInput() {
		String result = null;
		
		System.out.println("Would you want milk and sugar on the coffee??");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			result = input.readLine();
		}catch(IOException ioe){
			System.err.println("IO error, try to read your answer.");
		}
		if(result.equals(null))
			return "no";
		return result;
	}
}
