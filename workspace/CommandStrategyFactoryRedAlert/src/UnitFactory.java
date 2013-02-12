public class UnitFactory {	

	public static AircraftBomber getDefaultAircraftBomber() {
		DefaultAircraftBomberBuilder builder = new DefaultAircraftBomberBuilder();
		AircraftBomberDirector.construct(builder);
		return builder.getAircraftBomber();
	}
	
	public static AircraftBomber getSpecialAircraftBomber(){
		SpecialAircraftBomberBuilder builder = new SpecialAircraftBomberBuilder();
		AircraftBomberDirector.construct(builder);
		return builder.getAircraftBomber();
	}
	
	public static Tank createTank(){
		return new Tank();
	}
	
	public static Soldier createSoldier(){
		return new Soldier();
	}
}
