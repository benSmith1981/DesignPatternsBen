
public class MiniDuckSimulator {

	public static void main(String args[]){
		MallardDuck md = new MallardDuck();
		md.display();
		md.fly();
		md.quack();
		
		ConfigurableDuck cd = new ConfigurableDuck(new FlyNoWay(), new Squeak());
		ConfigurableDuck anotherCd = new ConfigurableDuck(new FlyWithWings(), new Quack());
		cd.display();
		cd.fly();
		cd.quack();
		anotherCd.display();
		anotherCd.fly();
		anotherCd.quack();
	}
}
