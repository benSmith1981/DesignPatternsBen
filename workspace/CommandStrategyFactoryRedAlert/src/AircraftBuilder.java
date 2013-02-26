
public abstract class AircraftBuilder {
	protected AircraftBomber aircraftBomber;
	protected AircraftMissileShooter aircraftMissileShooter;

	public abstract void buildWings();
	public abstract void buildFuselage();
	public abstract void buildWeapon();
	
	/**
	 * This method is here as we only need to build a camera for a bomber type so if we make it abstract then it has to
	 * be included in both missile shooter and bomber builder classes that makes no sense...
	 */
	public void buildCamera()
	{
		aircraftBomber.setCamera("Build Camera for bomber");
	}
	
	/**
	 * Specifically get the type of bomber aircraft, so we don't have to downcast
	 * @return
	 */
	public AircraftBomber getAircraftBomber()
	{
		return aircraftBomber;
	}
	
	/**
	 * Specifically get the type of missile shooter aircraft, so we don't have to downcast
	 * @return
	 */
	public AircraftMissileShooter getAircraftMissileShooter()
	{
		return aircraftMissileShooter;
	}
}
