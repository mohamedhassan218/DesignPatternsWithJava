//
// This is the invoker
//
public class RemoteControl 
{
	//Two arrays to hold the on and off devices:
	//and the undo button:
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	//Constructor to instantiate and initialize the 
	//on and off commands with noCommand as a default:
	public RemoteControl() 
	{
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) 
		{
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		//make the undo button point to null command:
		undoCommand = noCommand;
	}
  
	//Set the order:
	public void setCommand(int slot, Command onCommand, Command offCommand) 
	{
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	//Execute the command:
	public void onButtonWasPushed(int slot) 
	{
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
 
	public void offButtonWasPushed(int slot) 
	{
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
  
	public void undoButtonWasPushed()
	{
		undoCommand.undo();
	}
	
	public String toString() 
	{
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) 
		{
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
