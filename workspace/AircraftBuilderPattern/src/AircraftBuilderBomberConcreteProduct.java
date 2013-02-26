/**
 * This concrete aircraft builder builds the AircraftProduct by implementing the IAircraftBuilder
 * interface set of methods that set out how and AircraftProduct can be built
 * @author ben
 *
 */
public class AircraftBuilderBomberConcreteProduct implements IAircraftBuilder  {
	private AircraftProduct aircraftProduct;
	
	public AircraftBuilderBomberConcreteProduct()
	{
		aircraftProduct = new AircraftProduct();
	}
	
	@Override
	public void buildWings()
	{
		aircraftProduct.setWings("Builder bomber wings");
	}
	
	@Override
	public void buildFuselage()
	{
		aircraftProduct.setFuselage("Build bomber fuselage");
	}
	
	@Override
	public void buildWeapon()
	{
		aircraftProduct.setWeapon("Build bombs");
	}
	
	@Override
	public void buildCamera()
	{
		aircraftProduct.setCamera("");
	}
	
	@Override
	public AircraftProduct getAircraftProduct()
	{
		return aircraftProduct;
	}
}
