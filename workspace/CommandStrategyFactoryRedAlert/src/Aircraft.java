public abstract class Aircraft extends Unit{
	private TakePictureOfTargetStrategy takePicture;
	private String wings;
	private String propellor;
	private String fuselage;

	public Aircraft(MoveStrategy mv, FireAtTargetStrategy f, TakePictureOfTargetStrategy tp){
		super(new Fly(), new DropBomb());
		takePicture = tp;
	}
	
	public void takePictureOfTarget(Unit pictureTaker, Unit target){
		takePicture.takePictureOfTarget(pictureTaker,target);
	}
	
	public void setWings(String wings) {
		this.wings = wings;
	}
	public void setPropellor(String propellor) {
		this.propellor = propellor;
	}
	public void setFuselage(String fuselage) {
		this.fuselage = fuselage;
	}
	public String getFuselage() {
		return fuselage;
	}
	public String getPropellor() {
		return propellor;
	}
	public String getWings() {
		return wings;
	}
}
