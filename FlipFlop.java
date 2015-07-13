
public class FlipFlop {

	private boolean flip = true;
	
	synchronized public void flip() throws InterruptedException{
		while(flip){
			wait();
		}
		flip = false;
		System.out.println("Flip!");
		notifyAll();
	}
	
	synchronized public void flop() throws InterruptedException{
		while(!flip){
			wait();
		}
		flip = true;
		System.out.print("Flop!");
		notifyAll();
	}
}
