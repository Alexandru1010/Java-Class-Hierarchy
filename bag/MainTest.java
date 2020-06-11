package bag;

import generate.*;
import surprise.*;

public class MainTest {

	public static void main(String[] args) {


		BagFactory newBag = new BagFactory();
		IBag newFifo = newBag.makeBag("FIFO");
		IBag newLifo = newBag.makeBag("LIFO");
		ISurprise newCandy= new Candies();
		
		ISurprise newCookies = new FortuneCookies();
		ISurprise newToy = new MinionToy();
		IBag newRandom = newBag.makeBag("Random");
		
		newFifo.put(newCandy);
		newFifo.put(newToy);
		newLifo.put(newCandy);
		newLifo.put(newCookies);
		System.out.println(newFifo);
		System.out.println(newFifo.size());
		newFifo.put(newLifo);
		System.out.println(newLifo.isEmpty());
		System.out.println(newFifo.size());
		System.out.println(newLifo.size());

		newFifo.put(GatherSurprises.gather());
		System.out.println(newFifo);
		newFifo.takeOut();
		newFifo.takeOut();
		ISurprise[] a = GatherSurprises.gather(2);
		for(int i = 0; i < a.length; i++){
			newLifo.put(a[i]);
		}
		
		System.out.println();
		System.out.println(newLifo);
		System.out.println();
		while(!newLifo.isEmpty()) {
			newLifo.takeOut().enjoy();
			
		}
		newRandom.put(GatherSurprises.gather());
		System.out.println(newRandom);
		System.out.println(newLifo);
		
	}
}

