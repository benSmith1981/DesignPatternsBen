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
		AircraftBuilderDirector aircraftDirector = new AircraftBuilderDirector(aircraftBuilder);
		//Tell director to go build this type of aircraft product
		aircraftDirector.constructAircraft(AircraftType.Bomber);
		//return Bomber aircraft
		return  aircraftDirector.getAircraftBomber();
	}
	
	/**
	 * Create your missile shooter aircraft
	 * @return An aircraft missile type
	 */
	public static AircraftMissileShooter createAircraftMissileShooter() 
	{  
		AircraftBuilderMissileShooter aircraftBuilderMissile = new AircraftBuilderMissileShooter();
		AircraftBuilderDirector aircraftDirector = new AircraftBuilderDirector(aircraftBuilderMissile);
		aircraftDirector.constructAircraft(AircraftType.MissileShooter);
		return aircraftDirector.getAircraftMissileShooter();
	}
	
	public static Tank createTank(){
		return new Tank();
	}
	
	public static Soldier createSoldier(){
		return new Soldier();
	}
}
