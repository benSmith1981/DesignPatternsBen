
public class AircraftBomberDirector {
	public static void construct(AircraftBomberBuilder aircraftBomberBuilder){
		aircraftBomberBuilder.buildFuselage();
		aircraftBomberBuilder.buildProp();
		aircraftBomberBuilder.buildWings();
	}
}
