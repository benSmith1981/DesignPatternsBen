
public class FireShell implements FireAtTargetStrategy {
	
	@Override
	public void fireAtTarget(Unit attacker, Unit target){
		System.out.println(attacker.getClass().getName() + " firing shell at " + target.getClass().getName());
	}
}
