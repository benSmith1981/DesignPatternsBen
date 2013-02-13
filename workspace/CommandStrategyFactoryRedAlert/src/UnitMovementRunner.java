import java.util.LinkedList;
import java.util.ArrayList; 

public class UnitMovementRunner {
	static ArrayList<UnitCommand> commandList;
	static LinkedList<Unit> moveGroup;
	public static void main(String[] args){
		
		commandList = new ArrayList<UnitCommand>();
		moveGroup = new LinkedList<Unit>();

		Soldier s = UnitFactory.createSoldier();
		Tank t = UnitFactory.createTank();

		AircraftBomber aircraftBomber = UnitFactory.getDefaultAircraftBomber();
		System.out.println(aircraftBomber);
		
		AircraftBomber aircraftBomber2 = UnitFactory.getSpecialAircraftBomber();
		System.out.println(aircraftBomber2);
		
		AircraftMissileShooter aircraftMissileShooter = UnitFactory.getDefautlAircraftMissileShooter();
		System.out.println(aircraftMissileShooter);
		
		AircraftMissileShooter aircraftMissileShooter2 = UnitFactory.getSpecialAircraftMissileShooter();
		System.out.println(aircraftMissileShooter2);
		
		addUnitToMoveGroup(s);
		addUnitToMoveGroup(t);
		addUnitToMoveGroup(aircraftBomber);
		//addUnitToMoveGroup(aircraftMissile);
		createMoveGroup();
		
		createAttackerFiresAtTarget(s,t);
		createAttackerFiresAtTarget(t,s);
		createAttackerFiresAtTarget(aircraftBomber,s);
		//createAttackerFiresAtTarget(aircraftMissile,t);
	
		createTakePictureOfTarget(aircraftBomber,s);
		
		executeCommandsForYourGo();
	}
	
	/**
	 * Creates an attack target command and adds to command list
	 * @param attacker
	 * @param target
	 */
	public static void createAttackerFiresAtTarget(Unit attacker, Unit target)
	{
		UnitFireAtTargetCommand fireCommand = new UnitFireAtTargetCommand(attacker,target);
		addCommandToArrayList(fireCommand);
	}
	
	/**
	 * Creates a take picture command and adds to command list
	 * @param pictureTaker
	 * @param target
	 */
	public static void createTakePictureOfTarget(Aircraft pictureTaker, Unit target)
	{
		AircraftTakePictureCommand takePictureCommand = new AircraftTakePictureCommand(pictureTaker,target);
		addCommandToArrayList(takePictureCommand);
	}
	
	/**
	 * Creates a move group, and adds command list
	 */
	public static void createMoveGroup()
	{
		UnitGroupMoveCommand ugmc = new UnitGroupMoveCommand(moveGroup, "Home");
		addCommandToArrayList(ugmc);
	}
	
	/**
	 * Adds units to the move group linked list
	 * @param unit
	 */
	public static void addUnitToMoveGroup(Unit unit)
	{
		moveGroup.add(unit);
	}
	
	/**
	 * Adds command to our command array list
	 * @param command
	 */
	public static void addCommandToArrayList(UnitCommand command)
	{
		commandList.add(command);
	}
	
	/**
	 * Iterates our commandList array executing each command stored
	 */
	public static void executeCommandsForYourGo()
	{
		for (int i = 0; i < commandList.size(); i++) {
			commandList.get(i).executeCommand();
		}
	}
}
