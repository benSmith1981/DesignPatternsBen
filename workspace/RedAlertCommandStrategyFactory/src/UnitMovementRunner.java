import java.util.LinkedList;

public class UnitMovementRunner {
	public static void main(String[] args){

		UnitFactory tankFactory = new TankFactory();
		UnitFactory soldierFactory = new SoldierFactory();
		UnitFactory aircraftFactory = new AircraftFactory();

		Unit s = soldierFactory.makeUnit("Soldier");
		Unit t = tankFactory.makeUnit("Tank");
		Unit aircraftBomber = aircraftFactory.makeUnit("Bomber");
		Unit aircraftMissile = aircraftFactory.makeUnit("MissileShooter");

		LinkedList<Unit> moveGroup = new LinkedList<Unit>();
		moveGroup.add(s);
		moveGroup.add(t);
		moveGroup.add(aircraftBomber);
		moveGroup.add(aircraftMissile);
		
		UnitGroupMove(moveGroup, "Home");
		
		attackerFiresAtTarget(s,t);
		attackerFiresAtTarget(t,s);
		attackerFiresAtTarget(aircraftBomber,s);
		attackerFiresAtTarget(aircraftMissile,t);
		
		takePictureOfTarget(aircraftBomber,s);
		
		//Here soldiers cannot take pictures so the NoCommand implementation is executed
		takePictureOfTarget(s,aircraftBomber);
		takePictureOfTarget(t,aircraftBomber);


	}
	
	public static void UnitGroupMove(LinkedList<Unit> moveGroup, String Location)
	{
		UnitGroupMoveCommand ugmc = new UnitGroupMoveCommand(moveGroup, Location);
		ugmc.executeCommand();
	}
	
	public static void attackerFiresAtTarget(Unit attacker, Unit target)
	{
		UnitFireAtTargetCommand fireCommand = new UnitFireAtTargetCommand(attacker,target);
		fireCommand.executeCommand();
	}
	
	public static void takePictureOfTarget(Unit pictureTaker, Unit target)
	{
		UnitTakePictureCommand takePictureCommand = new UnitTakePictureCommand(pictureTaker,target);
		takePictureCommand.executeCommand();
	}
	
	public LinkedList<Unit> addUnitToCommandGroup(Unit unit, LinkedList<Unit> commandGroup)
	{
		commandGroup.add(unit);
		return commandGroup;
	}

}
