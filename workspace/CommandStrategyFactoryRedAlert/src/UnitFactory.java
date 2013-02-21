public class UnitFactory {	

	/**
	 * Create your bomber aircraft
	 * @return An aircraft bomber type
	 */
	public static AircraftBomber createAircraftBomber() 
	{  		
		//set the builder type
		AircraftBuilderBomber.setAircraftBuilder(AircraftType.Bomber);
		//set our aircraft to be built, through the static builder bomber property
		AircraftBuilderBomber.aircraftBuilderBomber.setAircraft(AircraftType.Bomber);
		//now construct our aircraft with our builder
		AircraftBuilderBomber.constructAircraftWithBuilder(AircraftType.Bomber);
		//return type of aircraft that has been built,
		//Note: I didn't use a getter method for this instance variable as I need to return an exact type and I don't want to downcast, 
		//and when I do try to access the variable through a getter I get an error...
		return AircraftBuilderBomber.aircraftBuilderBomber.aircraftBomber; 	
	}
	
	/**
	 * Create your missile shooter aircraft
	 * @return An aircraft missile type
	 */
	public static AircraftMissileShooter createAircraftMissileShooter() 
	{  
		//set the builder type
		AircraftBuilderMissileShooter.setAircraftBuilder(AircraftType.MissileShooter);
		//set our aircraft to be built, through the static builder bomber property
		AircraftBuilderMissileShooter.aircraftBuilderMissileShooter.setAircraft(AircraftType.MissileShooter);
		//now construct our aircraft with our builder
		AircraftBuilderMissileShooter.constructAircraftWithBuilder(AircraftType.MissileShooter);
		//return type of aircraft that has been built,
		//Note: I didn't use a getter method for this instance variable as I need to return an exact type and I don't want to downcast
		return AircraftBuilderMissileShooter.aircraftBuilderMissileShooter.aircraftMissileShooter; 
	}
	
	public static Tank createTank(){
		return new Tank();
	}
	
	public static Soldier createSoldier(){
		return new Soldier();
	}
}
