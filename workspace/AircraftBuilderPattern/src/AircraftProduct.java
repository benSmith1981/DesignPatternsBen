/**
 * This is our product, which represents what an aircraft is composed of, and is what gets
 * built in our builder pattern
 * @author ben
 *
 */
public class AircraftProduct {
	private String wings;
	private String fuselage;
	private String weapon;
	private String camera;
	
	public String getWings()
	{
		return wings;
	}
	
	public void setWings(String wings)
	{
		this.wings = wings;
	}
	
	public String getFuselage()
	{
		return fuselage;
	}
	
	public void setFuselage(String fuselage)
	{
		this.fuselage = fuselage;
	}
	
	public String getWeapon()
	{
		return weapon;
	}
	
	public void setWeapon(String weapon)
	{
		this.weapon = weapon;
	}
	
	public String getCamera()
	{
		return camera;
	}
	
	public void setCamera(String camera)
	{
		this.camera = camera;
	}
}
