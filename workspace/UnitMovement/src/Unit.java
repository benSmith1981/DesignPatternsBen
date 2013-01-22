
public abstract class Unit {
	private MoveStrategy movement;
	
	public Unit(MoveStrategy mv){
		movement = mv;		
	}
	
	public void doMove(String location){
		movement.doMove(location);
	}
}
