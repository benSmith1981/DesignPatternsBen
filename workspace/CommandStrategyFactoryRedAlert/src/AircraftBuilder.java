
public abstract class AircraftBuilder {
	protected AircraftBomber aircraftBomber;

	public AircraftBomber getAircraftBomber()
	{
		return aircraftBomber;
	}

    public void createNewAircraftBomber() 
    { 
    	aircraftBomber = new AircraftBomber(); 
    }
    
    public abstract void buildWings();
    public abstract void buildPropellor();
    public abstract void buildFuselage();
}
