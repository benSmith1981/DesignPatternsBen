public class AircraftMissileShooter extends Aircraft {
	
	public AircraftMissileShooter(){
		super(new Fly(), new FireMissile(), new TakePicture());
	}
	
	public String getWings()
	{
		return wings;
	}
	
	public void setWings(String wings)
	{
		System.out.println(wings);
		this.wings = wings;
	}
	
	public String getFuselage()
	{
		return fuselage;
	}
	
	public void setFuselage(String fuselage)
	{
		System.out.println(fuselage);
		this.fuselage = fuselage;
	}
	
	public String getWeapon()
	{
		return weapon;
	}
	
	public void setWeapon(String weapon)
	{
		System.out.println(weapon);
		this.weapon = weapon;
	}
	
	public String getCamera()
	{
		return camera;
	}
	
	public void setCamera(String camera)
	{
		System.out.println(camera);
		this.camera = camera;
	}
}
