public class DropBomb implements FireAtTargetStrategy {
	
	@Override
	public void fireAtTarget(Unit attacker, Unit target){
		System.out.println(attacker.getClass().getName() + " drops bomb on " + target.getClass().getName());
	}
}
