public class UnitFactory {	

    private AircraftBuilderBomber aircraftBuilderBomber;
    private AircraftBuilderMissile aircraftBuilderMissileShooter;

    /**
     * Sets the local instance of aircraft builder for type of aircraft using it's specific builder
     * @param aircraftType
     * @param aircraftBuilder
     */
    public void setAircraftBuilder(AircraftType aircraftType, AircraftBuilder aircraftBuilder) 
    {
		switch (aircraftType) 
		{
			case Bomber:
				this.aircraftBuilderBomber = (AircraftBuilderBomber)aircraftBuilder; 
				break;
			case MissileShooter:
				this.aircraftBuilderMissileShooter = (AircraftBuilderMissile)aircraftBuilder; 
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
    public Aircraft getAircraft(AircraftType aircraftType) 
    {
		switch (aircraftType) 
		{
			case Bomber:
				return (Aircraft)aircraftBuilderBomber.getAircraft(aircraftType); 
			case MissileShooter:
				return (Aircraft)aircraftBuilderMissileShooter.getAircraft(aircraftType); 
			default:
				return null;
		}
    }
 
    /**
     * Constructor for our aircraft, simply pass in the AircraftType you want and it is constructed
     * @param aircraftType
     */
    public void constructAircraftBuilder(AircraftType aircraftType) {
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
	
	public static Tank createTank(){
		return new Tank();
	}
	
	public static Soldier createSoldier(){
		return new Soldier();
	}
}
