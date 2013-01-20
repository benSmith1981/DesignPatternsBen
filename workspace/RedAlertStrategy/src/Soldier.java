
public class Soldier extends Units{

	public Soldier() {
		super(new March(), new ShootWithRifle());
	}
	
	public void display(){
		System.out.println("Soldier Attention!");

	}
}
