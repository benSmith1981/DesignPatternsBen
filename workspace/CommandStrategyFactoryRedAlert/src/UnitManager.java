//import java.util.ArrayList;
//import java.util.LinkedList;
//
//
//public class UnitManager {
//	private ArrayList<UnitCommand> commandList;
//	private LinkedList<Unit> moveGroup;
//	public UnitManager()
//	{
//		commandList = new ArrayList<UnitCommand>();
//		moveGroup = new LinkedList<Unit>();
//		GroundUnitFactory groundUnitFactory = new GroundUnitFactory();
//		AircraftFactory aircraftFactory = new AircraftFactory();
//
//		Unit s = groundUnitFactory.createUnit("Soldier");
//		Unit t = groundUnitFactory.createUnit("Tank");
//		Aircraft aircraftBomber = aircraftFactory.createUnit("Bomber");
//		Aircraft aircraftMissile = aircraftFactory.createUnit("MissileShooter");
//		
//		addUnitToMoveGroup(s);
//		addUnitToMoveGroup(t);
//		addUnitToMoveGroup(aircraftBomber);
//		addUnitToMoveGroup(aircraftMissile);
//		createMoveGroup();
//		
//		createAttackerFiresAtTarget(s,t);
//		createAttackerFiresAtTarget(t,s);
//		createAttackerFiresAtTarget(aircraftBomber,s);
//		createAttackerFiresAtTarget(aircraftMissile,t);
//	
//		createTakePictureOfTarget(aircraftBomber,s);
//		
//		executeCommandsForYourGo();
//	}
//	
//	/**
//	 * Creates a move group, and adds command list
//	 */
//	private void createMoveGroup()
//	{
//		UnitGroupMoveCommand ugmc = new UnitGroupMoveCommand(moveGroup, "Home");
//		addCommandToArrayList(ugmc);
//	}
//	
//	/**
//	 * Adds units to the move group linked list
//	 * @param unit
//	 */
//	private void addUnitToMoveGroup(Unit unit)
//	{
//		moveGroup.add(unit);
//	}
//	
//	/**
//	 * Adds command to our command array list
//	 * @param command
//	 */
//	private void addCommandToArrayList(UnitCommand command)
//	{
//		commandList.add(command);
//	}
//	
//	/**
//	 * Creates an attack target command and adds to command list
//	 * @param attacker
//	 * @param target
//	 */
//	private void createAttackerFiresAtTarget(Unit attacker, Unit target)
//	{
//		UnitFireAtTargetCommand fireCommand = new UnitFireAtTargetCommand(attacker,target);
//		addCommandToArrayList(fireCommand);
//	}
//	
//	/**
//	 * Creates a take picture command and adds to command list
//	 * @param pictureTaker
//	 * @param target
//	 */
//	private void createTakePictureOfTarget(Aircraft pictureTaker, Unit target)
//	{
//		AircraftTakePictureCommand takePictureCommand = new AircraftTakePictureCommand(pictureTaker,target);
//		addCommandToArrayList(takePictureCommand);
//	}
//	
//	/**
//	 * Iterates our commandList array executing each command stored
//	 */
//	private void executeCommandsForYourGo()
//	{
//		for (int i = 0; i < commandList.size(); i++) {
//			commandList.get(i).executeCommand();
//		}
//	}
//}
