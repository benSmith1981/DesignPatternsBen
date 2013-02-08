public class Fly implements MoveStrategy {
	
	@Override
	public void doMove(String location) {
		System.out.println("Flying to " + location);
	}
}
