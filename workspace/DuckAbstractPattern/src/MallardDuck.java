
public class MallardDuck extends Duck{

	public MallardDuck() {
		QuackBehaviour quackBehaviour = new Quack();
		FlyBehaviour flyBehaviour = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I'm a real mallard duck");

	}
}
