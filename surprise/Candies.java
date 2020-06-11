 package surprise;
import java.util.*;
public class Candies implements ISurprise {
	
	private static final String[] types = {"ciocolata", "jeleu", "fructe", "vanilie"};
	private String type;
	private int number;
	private static final Random random = new Random();
	
	public Candies() {
		
	}
	
	public Candies(int nbOfCandies, String type ) {
		this.number = nbOfCandies;
		this.type = type;
	}
	
	@Override
	public String toString() {
		 return "Candy";
	}
	
	@Override
	public void enjoy() {
		generate();
	}
	
	public Candies generate() {
		this.type = Candies.types[random.nextInt(4)];
		this.number =  Candies.random.nextInt(50) + 1;
		Candies candy = new Candies(this.number, type);
		if(this.number < 20) {
			System.out.println("Ai primit " + this.number + " bomboane cu " + this.type);
		} else {
			System.out.println("Ai primit " + this.number + " de bomboane cu " + this.type);
		}
		return candy;
	}
	
	
}
