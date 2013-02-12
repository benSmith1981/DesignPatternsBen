public class UnitFactory {	

    private static AircraftBuilderBomber aircraftBuilderBomber;
    private static AircraftBuilderMissile aircraftBuilderMissileShooter;

    /**
     * Sets the local instance of aircraft builder for type of aircraft using it's specific builder
     * @param aircraftType
     * @param aircraftBuilder
     */
    public static void setAircraftBuilder(AircraftType aircraftType, AircraftBuilderBomber aircraftBuilderBomber ,AircraftBuilderMissile aircraftBuilderMissile) 
    {
		switch (aircraftType) 
		{
			case Bomber:
				UnitFactory.aircraftBuilderBomber = aircraftBuilderBomber; 
				break;
			case MissileShooter:
				UnitFactory.aircraftBuilderMissileShooter = aircraftBuilderMissile; 
				break;
			default:
				break;
		}
    }
    
    /**
     * Getter for newly created aircraft, must request aircraft type, must cast back to the specific type of aircraft you require
     * @param aircraftType Request type of aircraft you want
     * @return An object of type Aircraft (either a missile shooter or a bomber)
     */
    public static Aircraft getAircraft(AircraftType aircraftType) 
    {
		switch (aircraftType) 
		{
			case Bomber:
				return aircraftBuilderBomber.getAircraft(aircraftType); 
			case MissileShooter:
				return aircraftBuilderMissileShooter.getAircraft(aircraftType); 
			default:
				return null;
		}
    }
 
    /**
     * Constructor for our aircraft, simply pass in the AircraftType you want and it is constructed
     * @param aircraftType
     */
    public static void constructAircraftBuilder(AircraftType aircraftType) {
		switch (aircraftType) 
		{
			case Bomber:
				aircraftBuilderBomber.createNewAircraft(aircraftType);
				aircraftBuilderBomber.buildFuselage();
				aircraftBuilderBomber.buildPropellor();
				aircraftBuilderBomber.buildWings();
				break;
			case MissileShooter:
				aircraftBuilderMissileShooter.createNewAircraft(aircraftType);
				aircraftBuilderMissileShooter.buildFuselage();
				aircraftBuilderMissileShooter.buildPropellor();
				aircraftBuilderMissileShooter.buildWings();	
				break;
			default:
				break;
		} 
    }
   
	public static AircraftBomber createAircraftBomber()
	{
		AircraftBuilderBomber bomberBuilder = new AircraftBuilderBomber();
		setAircraftBuilder(AircraftType.Bomber, bomberBuilder, null);
		constructAircraftBuilder(AircraftType.Bomber);
		return getAircraft(AircraftType.Bomber);
	}
    
	public static Tank createTank(){
		return new Tank();
	}
	
	public static Soldier createSoldier(){
		return new Soldier();
	}
}
