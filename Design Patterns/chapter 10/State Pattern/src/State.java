/*
 * Here's an interface for all states. 
 * The methods map directly to actions that could happen 
 * 	to the GumballMachine.
 **/
public interface State {

	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();

	public void refill();
}
