
public abstract class Units {
	private MoveBehaviour mb;
	private ShootBehaviour sb;
	
	public Units(MoveBehaviour mb, ShootBehaviour sb){
		this.mb = mb;
		this.sb = sb;
	}
	
	public void move(){
		mb.move();
	}
	
	public void shoot(){
		sb.shoot();
	}

}
