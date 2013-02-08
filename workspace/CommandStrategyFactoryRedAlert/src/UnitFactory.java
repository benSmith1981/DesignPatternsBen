public class UnitFactory {	

    private AircraftBuilderBomber aircraftBomberBuilder;
    
    /**
     * Sets the local instance of aircraftBomberBuilder
     * @param aircraftBomberBuilder
     */
    public void setAircraftBuilderBomber(AircraftBuilderBomber aircraftBomberBuilder) 
    { 
    	this.aircraftBomberBuilder = aircraftBomberBuilder; 
    }
    
    /**
     * Getter for newly created bomber 
     * @return
     */
    public AircraftBomber getAircraftBomber() 
    { 
    	return aircraftBomberBuilder.getAircraftBomber(); 
    }
 
    /**
     * Constructor for our bomber, telling bomber builder to create bomber and return
     * and build all necessary parts
     */
    public void constructAircraftBuilderBomber() {
    	aircraftBomberBuilder.createNewAircraftBomber();
    	aircraftBomberBuilder.buildFuselage();
    	aircraftBomberBuilder.buildPropellor();
    	aircraftBomberBuilder.buildWings();
    }
	
	public static AircraftMissileShooter createAircraftMissileShooter(){
		return new AircraftMissileShooter();
	}
	
	public static Tank createTank(){
		return new Tank();
	}
	
	public static Soldier createSoldier(){
		return new Soldier();
	}
}
