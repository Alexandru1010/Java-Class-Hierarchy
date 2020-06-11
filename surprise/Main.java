package surprise;

public class Main {

	public static void main(String[] args) {


		ISurprise newSurprise = new Candies();
		ISurprise newSurprise1 = new Candies();
		FortuneCookies newCookies = new FortuneCookies();
		FortuneCookies newCookies1 = new FortuneCookies();
		MinionToy newToy = new MinionToy();
		
		newSurprise.enjoy();
		newSurprise1.enjoy();
		
		newCookies.enjoy();
		newCookies1.enjoy();
		

		newToy.enjoy();
		newToy.enjoy();
		newToy.enjoy();
		newToy.enjoy();
		newToy.enjoy();
		newToy.enjoy();
		newToy.enjoy();
		newToy.enjoy();
		newToy.enjoy();
		
		
		
	}

}
