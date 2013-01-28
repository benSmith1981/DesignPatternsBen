
public class AircraftFactory extends UnitFactory{
	Unit createUnit(String type){
		if(type.equals("Bomber"))
		{
			return new AircraftBomber();
		}
		else if(type.equals("MissileShooter"))
		{
			return new AircraftBomber();
		}
		return null;
	}
}
