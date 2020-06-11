package share;

import generate.*;
import surprise.*;

public class Main {

	public static void main(String[] args) {
		
		AbstractGiveSurprises newAction = new GiveSurpriseAndApplause("random", 3);
		AbstractGiveSurprises newContainer = new GiveSurpriseAndApplause("lifo", 2);
		//AbstractGiveSurprises newGiveAndHug = new GiveSurpriseAndHug("lifo", 8);
		
		//newContainer.put(GatherSurprises.gather());
		//newAction.put(GatherSurprises.gather());
		
		
		
		ISurprise [] surprise = GatherSurprises.gather(4);
		for(int i = 0; i < surprise.length; i++) {
			newAction.put(surprise[i]);
		}
		
		newContainer.put(newAction.getContainer());
		System.out.println(newContainer.getContainer().toString());
		System.out.println(newContainer.isEmpty());
		//newContainer.give();
		newContainer.giveAll();
		
	}

}
