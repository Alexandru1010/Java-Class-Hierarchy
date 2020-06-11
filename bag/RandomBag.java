package bag;
import surprise.*;
import java.util.*;
public class RandomBag extends GenericBag {
	
	private Random random = new Random();
	private int number;
	
	public RandomBag() {
		this.surprise = new ArrayList<ISurprise>();
	}
			
	@Override
	public ISurprise takeOut() {
		if(this.isEmpty()) {
			System.out.println("Containerul este gol!");
			return null;
		}
		this.number = this.random.nextInt(this.surprise.size());
		return this.surprise.remove(this.number);
	
	}	
}