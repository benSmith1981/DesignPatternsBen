public class AircraftMissileShooter extends Aircraft {
	
	public AircraftMissileShooter(){
		super(new Fly(), new DropBomb(), new TakePicture());
	}
	
    public void setWings(String wingInstructions)
    {
    	System.out.println(wingInstructions);
    }
    
    public void setPropellor(String propellorInstructions)
    {
    	System.out.println(propellorInstructions);
    }
    
    public void setFuselage(String fuselageInstructions)
    {
    	System.out.println(fuselageInstructions);
    }
}
