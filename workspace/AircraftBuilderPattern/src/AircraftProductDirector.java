/**
 * The director takes the Interface for Aircraft product in its constructor, allowing us to direct it to build
 * any type of AircraftProduct, which it then returns in getAircraftProduct() to the caller
 * @author ben
 *
 */
public class AircraftProductDirector {

	private IAircraftBuilder IaircraftBuilder;
	
	public AircraftProductDirector(IAircraftBuilder IaircraftBuilder)
	{
		this.IaircraftBuilder = IaircraftBuilder;
	}
	
	public void constructAircraftProduct()
	{
		IaircraftBuilder.buildCamera();
		IaircraftBuilder.buildFuselage();
		IaircraftBuilder.buildWeapon();
		IaircraftBuilder.buildWings();
	}
	
	public AircraftProduct getAircraftProduct()
	{
		return IaircraftBuilder.getAircraftProduct();
	}
}
