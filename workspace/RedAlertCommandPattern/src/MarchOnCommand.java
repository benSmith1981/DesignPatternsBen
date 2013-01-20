
public class MarchOnCommand implements Command {
	March march;
 
	public MarchOnCommand(March march) {
		this.march = march;
	}
 
	public void execute() {
		march.on();
	}
	
	public void undo()
	{
		march.off();
	}
}
