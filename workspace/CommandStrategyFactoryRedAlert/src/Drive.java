public class Drive implements MoveStrategy {

	@Override
	public void doMove(String location) {
		System.out.println("driving to " + location);
	}
	
}
