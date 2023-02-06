//A new type of commands that can execute 
//other commands and more than one of them.
public class MacroCommand implements Command
{
	//array of commands:
	Command[] commands;
	
	public MacroCommand(Command[] commands)
	{
		this.commands = commands;
	}
	
	public void execute()
	{
		for(int i = 0; i < commands.length; i++)
			commands[i].execute();
	}
	
	public void undo()
	{
		for(int i = 0; i < commands.length; i++)
			commands[i].undo();
	}
}
