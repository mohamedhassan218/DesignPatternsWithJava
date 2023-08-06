import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffineBeverage{
	
	public void brew() 
	{System.out.println("Steeping the tea.");}
	
	public void addCondiments() 
	{System.out.println("Add Limon.");}
	
	public boolean customerWantsCondiments() {
		String result = getUserInput();
		if(result.toLowerCase().startsWith("y"))
			return true;
		else	
			return false;
	}
	
	// Method to take the user's requirements in the runtime.
	private String getUserInput() {
		String result = null;
		
		System.out.println("Would you want limon with the tea??");
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