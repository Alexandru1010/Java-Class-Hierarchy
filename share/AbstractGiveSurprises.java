package share;
import bag.*;
import surprise.*;
import java.util.concurrent.TimeUnit;
public abstract class AbstractGiveSurprises {
	
	private IBag container;
	private int waitTime;
	private static final BagFactory newBag = new BagFactory();
	
	public AbstractGiveSurprises(String type, int waitTime) {
		this.container = newBag.makeBag(type);
		this.waitTime = waitTime;
	}
	
	public IBag getContainer() {
		return container;
	}
	
	public void put(ISurprise newSurprise) {
		this.container.put(newSurprise);
	}
	
	public void put(IBag surprises) {
		this.container.put(surprises);
	}
	
	public void give() {
		if(this.container.isEmpty()) {
			System.out.println("Containerul este gol");	
		}
		 this.container.takeOut().enjoy();
		 this.giveWithPassion();
	}
	
	public void giveAll() {
		while(!this.container.isEmpty()) {
			this.give();
			try {
				TimeUnit.SECONDS.sleep(this.waitTime); 
			} catch (InterruptedException e) {
				 e.printStackTrace();
			}
		}
	}
	
	public boolean isEmpty() {
		return this.container.isEmpty();
	}
	
	abstract void giveWithPassion();
	
}
