public class AircraftDirector {
	private AircraftBuilder aircraftBuilder;
	
	public AircraftDirector(AircraftBuilder aircraftBuilder)
	{
		this.aircraftBuilder = aircraftBuilder;
	}
	
	public void constructAircraft()
	{
		aircraftBuilder.buildCamera();
		aircraftBuilder.buildFuselage();
		aircraftBuilder.buildWeapon();
		aircraftBuilder.buildWings();
	}
	
	public Aircraft getAircraft()
	{
		return aircraftBuilder.getAircraftProduct();
	}
}
