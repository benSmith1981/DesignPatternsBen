
public class Walk implements MoveStrategy {
	
	@Override
	public void doMove(String location) {
		System.out.println("walking to " + location);
	}
	
}
