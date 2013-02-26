/**
 * The director takes the Aircraft builder type that is extended from Aircraft in its constructor, allowing us to direct
 * it to build any type of Aircraft, which it then returns in getAircraftProduct() to the caller
 * @author ben
 *
 */
public class AircraftBuilderDirector {
	private AircraftBuilder aircraftBuilder;
	
	public AircraftBuilderDirector(AircraftBuilder aircraftBuilder)
	{
		this.aircraftBuilder = aircraftBuilder;
	}
	
	public void constructAircraft(AircraftType aircraftType)
	{
		switch (aircraftType) {
		case Bomber:
			aircraftBuilder.buildFuselage();
			aircraftBuilder.buildWeapon();
			aircraftBuilder.buildWings();
			aircraftBuilder.buildCamera();
			break;
		case MissileShooter:
			aircraftBuilder.buildFuselage();
			aircraftBuilder.buildWeapon();
			aircraftBuilder.buildWings();
			break;
		default:

			break;
		}
	}
	
	public Aircraft getAircraft()
	{
		return aircraftBuilder.getAircraftProduct();
	}
}
