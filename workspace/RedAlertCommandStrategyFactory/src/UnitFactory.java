
public abstract class UnitFactory {

	abstract Unit createUnit(String type);
	
	public Unit makeUnit(String type){
		return createUnit(type);
	}
}
