
public class Tank extends Units{

	public Tank() {
		super(new TankMove(), new ShootWithTankShell());
	}
	
	public void display(){
		System.out.println("Tank activated");

	}
}
