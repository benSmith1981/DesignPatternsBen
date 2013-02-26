
public class AircraftBuilderPatternDemo {

	public static void main(String[] args) 
	{
		//create type of concrete aircraft builder we want
		IAircraftBuilder aircraftBuilder = new AircraftBuilderBomberConcreteProduct();
		//Create director with this concrete aircraft product
		AircraftProductDirector aircraftDirector = new AircraftProductDirector(aircraftBuilder);
		//Tell director to go build this type of aircraft product
		aircraftDirector.constructAircraftProduct();
		//get our aircraft product back from director now it has been constructed
		System.out.println("Just made aircraft" + aircraftDirector.getAircraftProduct());
	}
}
