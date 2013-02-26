public class UnitFactory {	

	/**
	 * Create your bomber aircraft
	 * @return An aircraft bomber type
	 */
	public static AircraftBomber createAircraftBomber() 
	{  		
		//create type of concrete aircraft builder we want
		AircraftBuilderBomber aircraftBuilder = new AircraftBuilderBomber();
		//Create director with this concrete aircraft product
		AircraftDirector aircraftDirector = new AircraftDirector(aircraftBuilder);
		//Tell director to go build this type of aircraft product
		aircraftDirector.constructAircraft();
		//return Bomber aircraft
		return  (AircraftBomber) aircraftDirector.getAircraft();
	}
	
	/**
	 * Create your missile shooter aircraft
	 * @return An aircraft missile type
	 */
	public static AircraftMissileShooter createAircraftMissileShooter() 
	{  
		AircraftBuilderMissileShooter aircraftBuilderMissile = new AircraftBuilderMissileShooter();
		AircraftDirector aircraftDirector = new AircraftDirector(aircraftBuilderMissile);
		aircraftDirector.constructAircraft();
		return (AircraftMissileShooter)aircraftDirector.getAircraft();
	}
	
	public static Tank createTank(){
		return new Tank();
	}
	
	public static Soldier createSoldier(){
		return new Soldier();
	}
}
