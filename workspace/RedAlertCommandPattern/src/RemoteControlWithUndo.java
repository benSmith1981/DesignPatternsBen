
import java.util.*;

//
// This is the invoker
//
public class RemoteControlWithUndo {
	private Stack<Command> commandHistory = new Stack<Command>();
	Command[] onCommands;
	Command[] offCommands;
	private int totalCommands;
 	
	public RemoteControlWithUndo() {
		totalCommands = 2;
		onCommands = new Command[totalCommands];
		offCommands = new Command[totalCommands];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i < totalCommands;i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
 
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		commandHistory.push(onCommands[slot]);
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		//undoCommand = offCommands[slot];
		commandHistory.push(offCommands[slot]);
	}
	
	public void undoButtonWasPushed(){
		try{
			commandHistory.pop().undo();
		}
		catch(EmptyStackException e) {
			e.printStackTrace();
		}
	}
	
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n-----Remte Control ------\n");
		for(int i = 0; i < onCommands.length; i++){
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}	
}
