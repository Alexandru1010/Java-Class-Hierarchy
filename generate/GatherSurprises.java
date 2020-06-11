package generate;
import java.util.*;
import surprise.*;


public final class GatherSurprises {

	private static final Random random = new Random();
	
	private GatherSurprises() {
		
	}
	
	public static ISurprise[] gather(int n) {
		if(n < 1) {
			System.out.println("Eroare! Dimensiunea nu poate avea valoarea " + n);
			return null;
		}
		
		ISurprise[] array = new ISurprise[n];
		int randomNumber ;
		for(int i = 0; i < array.length; i++) {
			randomNumber = random.nextInt(3);
			if(randomNumber == 0) {
				ISurprise newCandy = new Candies();
				array[i] = newCandy;
			} else if(randomNumber == 1) {
				ISurprise newCookie = new FortuneCookies();
				array[i] = newCookie;
			} else if(randomNumber == 2) {
				ISurprise newToy = new MinionToy();
				array[i] = newToy;
			}
		}
		return array;
	}
	
	
	public static ISurprise gather() {
		int randomNumber = random.nextInt(3);
		if(randomNumber == 0) {
			ISurprise newCandy = new Candies();
			return newCandy;
		} else if(randomNumber == 1) {
			ISurprise newCookie = new FortuneCookies();
			return newCookie;
		} else if(randomNumber == 2) {
			ISurprise newToy = new MinionToy();
			return newToy;
		} else {
			return null;
		}
	}

}
