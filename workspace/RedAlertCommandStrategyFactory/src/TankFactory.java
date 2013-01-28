
public class TankFactory extends UnitFactory{

	Unit createUnit(String type){
		if(type.equals("Tank"))
		{
			return new Tank();
		}
		return null;
	}
}