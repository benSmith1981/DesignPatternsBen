
public class RedAlertRemote {
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		March soldierMarch = new March("Soldier Prepare Marching");
		MarchOffCommand marchOn = new MarchOffCommand(soldierMarch);
		MarchOnCommand marchOff = new MarchOnCommand(soldierMarch);
		
		remoteControl.setCommand(0, marchOn, marchOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		}
}
