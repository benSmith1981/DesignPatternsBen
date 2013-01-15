
public class SingletonClassForBen {
	private static int myInt = 0;
	
	private static SingletonClassForBen _instance = null;
	
	private SingletonClassForBen(){
		myInt++;
	}
	
	
	public int getMyInt() {
		return myInt;
	}
	
	public static SingletonClassForBen GetInstance(){
		if(_instance == null) _instance = new SingletonClassForBen();
		return _instance;
	}
}
