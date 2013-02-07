public class UnitFactory {	

	public static AircraftBomber createAircraftBomber(){
		return new AircraftBomber();
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
