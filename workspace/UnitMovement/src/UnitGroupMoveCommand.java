import java.util.LinkedList;

public class UnitGroupMoveCommand implements UnitCommand {

	private LinkedList<Unit> units;
	private String location;
	
	public UnitGroupMoveCommand(Unit u, String location) {
		units.add(u);
		this.location = location;
	}
	
	public UnitGroupMoveCommand(LinkedList<Unit> units, String location){
		this.units = units;
		this.location = location;		
	}
	@Override
	public void executeCommand() {
		for (Unit u : units) {
			u.doMove(location);			
		}
	}

}
