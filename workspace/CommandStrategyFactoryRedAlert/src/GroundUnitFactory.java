public class GroundUnitFactory extends UnitFactory{
	
	public Unit createUnit(String type){
		if(type.equals("Tank"))
		{
			System.out.println("Create Tank");
			return new Tank();
		}
		else if(type.equals("Soldier"))
		{
			System.out.println("Create Soldier");
			return new Soldier();
		}
		return null;
	}
}
