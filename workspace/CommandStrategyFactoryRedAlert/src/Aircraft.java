/**
 * This is our abstract product, which represents what an aircraft is composed of, and is what gets
 * built in our builder pattern, it is extended by the concrete products
 * @author ben
 *
 */
public abstract class Aircraft extends Unit{
	private TakePictureOfTargetStrategy takePicture;
	protected String wings;
	protected String fuselage;
	protected String weapon;
	protected String camera;

	/**
	 * Intialise our type of aircraft depending on the type of abilities it has, some shoot missiles, others take picture
	 * all the extended abstract class Unit requires is that we implemented a move and fire strategy
	 * @param mv
	 * @param f
	 * @param tp
	 */
	public Aircraft(MoveStrategy mv, FireAtTargetStrategy f, TakePictureOfTargetStrategy tp){
		super(new Fly(),f);
		takePicture = tp;
	}
	
	/**
	 * Only aircraft can take pictures so this method belongs in Aircraft
	 * @param pictureTaker
	 * @param target
	 */
	public void takePictureOfTarget(Unit pictureTaker, Unit target){
		takePicture.takePictureOfTarget(pictureTaker,target);
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
