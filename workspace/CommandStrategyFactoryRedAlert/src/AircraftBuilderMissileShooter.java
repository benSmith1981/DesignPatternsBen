
public class AircraftBuilderMissileShooter extends AircraftBuilder{
	
	public AircraftBuilderMissileShooter()
	{
		aircraftMissileShooter = new AircraftMissileShooter();
	}
	
	@Override
	public void buildWings()
	{
		aircraftMissileShooter.setWings("Build missile wings");
	}
	
	@Override
	public void buildFuselage()
	{
		aircraftMissileShooter.setFuselage("Build missile shooter fuselage");
	}
	
	@Override
	public void buildWeapon()
	{
		aircraftMissileShooter.setWeapon("Build missile guns");
	}
	
	@Override
	public void buildCamera()
	{
		aircraftMissileShooter.setCamera("");
	}
}
