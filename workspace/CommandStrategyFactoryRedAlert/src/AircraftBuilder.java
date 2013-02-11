
public abstract class AircraftBuilder {
	protected AircraftBomber aircraftBomber;
	protected AircraftMissileShooter aircraftMissileShooter;
	
	/**
	 * Must pass in an Aircraft type defined in an enum to get a type of aircraft
	 * @param aircraftType
	 * @return
	 */
	public Aircraft getAircraft(AircraftType aircraftType)
	{
		switch (aircraftType) 
		{
			case Bomber:
				return (Aircraft)aircraftBomber;
			case MissileShooter:
				return (Aircraft)aircraftMissileShooter;
			default:
				return null;
		}
	}

	/**
	 * Pass in the type of aircraft you want to create defined in enum
	 * @param aircraftType
	 */
    public void createNewAircraft(AircraftType aircraftType) 
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
    
    public abstract void buildWings();
    public abstract void buildPropellor();
    public abstract void buildFuselage();
}
