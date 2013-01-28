
public class SoldierFactory extends UnitFactory {

	Unit createUnit(String type){
		if(type.equals("Soldier"))
		{
			return new Soldier();
		}
		return null;
	}
}
