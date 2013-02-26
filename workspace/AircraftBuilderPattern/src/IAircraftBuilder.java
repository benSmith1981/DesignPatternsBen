/**
 * This is implemented by our concrete builders and defines what sort of building they can do
 * @author ben
 *
 */
public interface IAircraftBuilder 
{
	public void buildWings();
	public void buildFuselage();
	public void buildWeapon();
	public void buildCamera();
	public AircraftProduct getAircraftProduct();
}
