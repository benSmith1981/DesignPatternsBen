
public class UnitFireAtTargetCommand implements UnitCommand{

	private Unit target;
	private Unit attacker;

	public UnitFireAtTargetCommand(Unit attacker, Unit target)
	{
		this.target = target;
		this.attacker = attacker;
	}
	
	@Override
	public void executeCommand(){
		attacker.fireAtTarget(attacker, target);
	}
}
