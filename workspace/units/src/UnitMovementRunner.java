import java.util.LinkedList;

public class UnitMovementRunner {
	public static void main(String[] args){
		Soldier s = new Soldier();
		Tank t = new Tank();
		
		LinkedList<Unit> selectedGroup = new LinkedList<Unit>();
		selectedGroup.add(s);
		selectedGroup.add(t);
		
		UnitGroupMoveCommand ugmc = new UnitGroupMoveCommand(selectedGroup, "Home");
		ugmc.executeCommand();
		
		UnitFireAtTargetCommand ufat = new UnitFireAtTargetCommand(s,t);
		ufat.executeCommand();
		
		UnitFireAtTargetCommand tankFireSoldier = new UnitFireAtTargetCommand(t,s);
		tankFireSoldier.executeCommand();

	}
}
