
public abstract class Duck {
	private FlyBehaviour fb;
	private QuackBehaviour qb;
	
	public Duck(FlyBehaviour fb, QuackBehaviour qb){
		this.fb = fb;
		this.qb = qb;
	}
	
	public void quack(){
		qb.quack();
	}
	
	public void fly(){
		fb.fly();
	}

}
