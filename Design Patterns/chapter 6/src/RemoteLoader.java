
public class RemoteLoader 
{
 
	public static void main(String[] args) 
	{
		//take remote control object (the invoker):
		RemoteControl remoteControl = new RemoteControl();
 
		//take objects from the available basics classes (the receivers):
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");
  
		//take objects from the cocreteCommands classes and passes the Receiver to them:
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
		
		
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
 
		//set the commands to each slot:
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanLowCommand);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
  
		//invoke the toString method to display the remote and the slots:
		System.out.println(remoteControl);
 
		//turn on the living room light:
		remoteControl.onButtonWasPushed(0);
		//turn it off:
		remoteControl.offButtonWasPushed(0);
		//undo the last action:
		remoteControl.undoButtonWasPushed();
		
//////////////////////////////////////////////////////////////////////
		
		//set the value of it to high:
		remoteControl.onButtonWasPushed(2);
		//set the value of it to low:
		remoteControl.offButtonWasPushed(2);

		//undo the last action: (turn it back to high)
		remoteControl.undoButtonWasPushed();
		
/////////////////////////////////////////////////////////////////////
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		
		//NOTE:
		//We can simplify our code by using the lambda expressions and 
		//for more simplification, we can use the methods references.
		
	}
}
