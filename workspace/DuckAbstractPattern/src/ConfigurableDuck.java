
public class ConfigurableDuck extends Duck{
	public ConfigurableDuck(FlyBehaviour fb, QuackBehaviour qb){
		super(fb,qb);
	}
	public void display(){
		System.out.println("A Configurable Duck");
	}

}
