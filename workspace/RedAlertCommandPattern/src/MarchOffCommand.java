
public class MarchOffCommand implements Command {
	March march;
  
	public MarchOffCommand(March march) {
		this.march = march;
	}
 
	public void execute() {
		march.off();
	}
	
	public void undo()
	{
		march.on();
	}
}
