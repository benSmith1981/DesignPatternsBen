
public abstract class AircraftBuilder {
	protected AircraftBomber aircraftBomber;
	protected AircraftMissileShooter aircraftMissileShooter;
	
	public Aircraft getAircraft(AircraftType aircraftType)
	{
		switch (aircraftType) {
		case Bomber:
			return (Aircraft)aircraftBomber;
		case MissileShooter:
			return (Aircraft)aircraftMissileShooter;
		default:
			return null;
		}
	}

    public void createNewAircraft(AircraftType aircraftType) 
    { 
		switch (aircraftType) {
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
