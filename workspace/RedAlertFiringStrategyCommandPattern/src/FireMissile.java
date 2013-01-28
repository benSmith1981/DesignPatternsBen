
public class FireMissile implements FireAtTargetStrategy {
	
	@Override
	public void fireAtTarget(Unit attacker, Unit target){
		System.out.println(attacker.getClass().getName() + " fires missile at " + target.getClass().getName());
	}
}
