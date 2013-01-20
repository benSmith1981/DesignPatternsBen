
public class RedAlertStrategy {

	public static void main(String args[]){
		
		ConfigurableUnit soldier = new ConfigurableUnit(new March(), new ShootWithRifle());
		ConfigurableUnit tank = new ConfigurableUnit(new TankMove(), new ShootWithTankShell());
		
		soldier.display();
		soldier.move();
		soldier.shoot();
		
		tank.display();
		tank.move();
		tank.shoot();
	}
}
