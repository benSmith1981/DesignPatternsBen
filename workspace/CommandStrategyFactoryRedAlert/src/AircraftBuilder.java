
public abstract class AircraftBuilder {
	//These are instances as we may have many aircraft bombers and missile shooters
	protected AircraftBomber aircraftBomber;
	protected AircraftMissileShooter aircraftMissileShooter;
 
	//These can be static as we don't need a class reference to them, and we only need one
	protected static AircraftBuilderBomber aircraftBuilderBomber;
	protected static AircraftBuilderMissileShooter aircraftBuilderMissileShooter;
	
	/**
	 * Tell Builder what type of aircraft builder you want to set to build the aircraft you have set
	 * @param aircraftType
	 */
	public static void setAircraftBuilder(AircraftType aircraftType)
	{
		switch (aircraftType) 
		{
			case Bomber:
				aircraftBuilderBomber = new AircraftBuilderBomber();
				break;
			case MissileShooter:
				aircraftBuilderMissileShooter = new AircraftBuilderMissileShooter();
				break;
			default:
				break;
		} 
	}
	
	/**
	 * Tell Builder to set the aircraft that is going to be built by the builder
	 * @param aircraftType
	 */
    public void setAircraft(AircraftType aircraftType)
    {
		switch (aircraftType) 
		{
			case Bomber:
				aircraftBomber = new AircraftBomber();
				break;
			case MissileShooter:
				aircraftMissileShooter = new AircraftMissileShooter();
				break;
			default:
				break;
		}     
	}
    
    //I would delete this but thought I would leave it in for now until we chat Klass
	/**
	 * Get the aircraft that have been created
	 * @param aircraftType
	 */
    public Aircraft getAircraft(AircraftType aircraftType)
    {
		switch (aircraftType) 
		{
			case Bomber:
				return aircraftBomber;
			case MissileShooter:
				return aircraftMissileShooter;
			default:
				return null;
		}     
	}

    /**
     * Constructor for our aircraft, simply pass in the AircraftType you want and it is constructed
     * @param aircraftType
     */
    public static void constructAircraftWithBuilder(AircraftType aircraftType) {
		switch (aircraftType) 
		{
			case Bomber:
				aircraftBuilderBomber.buildFuselage();
				aircraftBuilderBomber.buildPropellor();
				aircraftBuilderBomber.buildWings();
				break;
			case MissileShooter:
				aircraftBuilderMissileShooter.buildFuselage();
				aircraftBuilderMissileShooter.buildPropellor();
				aircraftBuilderMissileShooter.buildWings();	
				break;
			default:
				break;
		} 
    }
    
    public abstract void buildWings();
    public abstract void buildPropellor();
    public abstract void buildFuselage();
}
