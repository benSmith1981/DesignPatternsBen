/**
 * This is the concrete aircraft builder that builds the AircraftBuilderBomber by extending the AircraftBuilder
 * abstract class set of methods that set out how and AircraftProduct can be built
 * @author ben
 *
 */
public class AircraftBuilderBomber extends AircraftBuilder{
	
	public AircraftBuilderBomber()
	{
		aircraftBomber = new AircraftBomber();
	}
	
	@Override
	public void buildWings()
	{
		aircraftBomber.setWings("Build bomber wings");
	}
	
	@Override
	public void buildFuselage()
	{
		aircraftBomber.setFuselage("Build bomber fuselage");
	}
	
	@Override
	public void buildWeapon()
	{
		aircraftBomber.setWeapon("Build bombs");
	}
}
