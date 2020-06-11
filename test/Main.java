package test;
import surprise.*;
import share.*;
import generate.*;
import java.util.*;
public class Main {

	public static void intro() {
		System.out.println("Vom crea mai multe tolbe diferite apoi vom adauga surprize in fiecare");
		System.out.println("Pentru inceput vom crea trei moduri de impartire a surprizelor:" + "\n" +
							"GiveSurpriseAndApplause" + "\n" + 
							"GiveSurpriseAndSing" + "\n" +
							"GiveSurpriseAndHug");
		
		System.out.println("Vom crea pentru fiecare mod de a darui cate 2 tipuri de containere!");
		System.out.println("Alege un interval de timp(secunde) ce ne va folosi la daruirea surprizelor:");
	}
	public static int time(Scanner sc) {
		int waitTime = sc.nextInt();
		while(waitTime < 0 ) {
			System.out.println("Timpul de asteptare nu poate fi negativ. Introduceti o valoare pozitiva!");
			waitTime = sc.nextInt();
		}
		return waitTime;
	}
	
	public static ArrayList<AbstractGiveSurprises> makeBags(int waitTime){
		ArrayList<AbstractGiveSurprises> bags = new ArrayList<AbstractGiveSurprises>();
		AbstractGiveSurprises newApplause = new GiveSurpriseAndApplause("RANDOM", waitTime);
		AbstractGiveSurprises newApplause1 = new GiveSurpriseAndApplause("LIFO", waitTime);
		AbstractGiveSurprises newHug = new GiveSurpriseAndHug("FIFO", waitTime);
		AbstractGiveSurprises newHug1 = new GiveSurpriseAndHug("LIFO", waitTime);
		AbstractGiveSurprises newSing = new GiveSurpriseAndSing("LIFO", waitTime);
		AbstractGiveSurprises newSing1 = new GiveSurpriseAndSing("FIFO", waitTime);
		bags.add(newApplause);
		bags.add(newApplause1);
		bags.add(newHug);
		bags.add(newHug1);
		bags.add(newSing);
		bags.add(newSing1);
		return bags;
		
	}
	public static void addSurprises(Scanner sc ,ArrayList<AbstractGiveSurprises> bags) {
		System.out.println("Vom adauga in fiecare container cate o surpriza");
		System.out.println("Doresti sa continui? Y/N");
		String optiune = sc.next();
		if(optiune.toLowerCase().equals("y")) {
			for(AbstractGiveSurprises bag : bags) {
				bag.put(GatherSurprises.gather());
			}
		
			for(AbstractGiveSurprises bag : bags) {
				System.out.println(bag.getContainer());
			}
			System.out.println("Fiecare container, indiferent de tip, contine o surpriza.");
			System.out.println("In continuare vom demonstra modurile de a darui, daruind cate o surpriza din fiecare container!");
			System.out.println();
			for(int i = 0; i < bags.size(); i += 2) {
				bags.get(i).give();		
			}
			System.out.println();
		} else {
			System.out.println("Se va trece la urmator pas al aplicatiei!");
		}
	}
	public static void takeOut(Scanner sc, ArrayList<AbstractGiveSurprises> bags) {
		System.out.println("Vom introduce surprize in 3 containere de tipuri diferite si vom observa modul in care vor fi scoase surprizele");
		System.out.println("Doresti sa continui? Y/N");
		String optiune1 = sc.next();
		if(optiune1.toLowerCase().equals("y")) {
			System.out.println("Introdu un numar de surprize");
			int nrSurprize = sc.nextInt();
			
			for(int i = 0; i < nrSurprize; i++) {
				ISurprise [] surprise = GatherSurprises.gather(nrSurprize);
				bags.get(0).put(surprise[i]);
				surprise = GatherSurprises.gather(nrSurprize);
				bags.get(2).put(surprise[i]);
				surprise = GatherSurprises.gather(nrSurprize);
				bags.get(4).put(surprise[i]);
			}
			System.out.println();
			System.out.println("RANDOM " + bags.get(0).getContainer());
			System.out.println("FIFO " + bags.get(2).getContainer());
			System.out.println("LIFO " + bags.get(4).getContainer());
			System.out.println();
			System.out.println("Scoatem o surpriza din containerul de tipul RANDOM");
			bags.get(0).give();
			System.out.println("Scoatem o surpriza din containerul de tipul FIFO");
			bags.get(2).give();
			System.out.println("Scoatem o surpriza din containerul de tipul LIFO");
			bags.get(4).give();
		
		} else {
			System.out.println("Se va trece la urmator pas al aplicatiei!");
		}
	}
	
	public static void mergeContainers(Scanner sc, ArrayList<AbstractGiveSurprises> bags) {
		System.out.println("Vom continua prin a introduce toate surprizele dintr-un container in altul!");
		System.out.println("Doresti sa continui? Y/N");
		String optiune2 = sc.next();
		if(optiune2.toLowerCase().equals("y")) {
			System.out.println("Inainte:");
			System.out.println("RANDOM " + bags.get(0).getContainer());
			System.out.println("FIFO " + bags.get(2).getContainer());
			System.out.println("LIFO " + bags.get(4).getContainer());
			System.out.println();

			bags.get(2).put(bags.get(0).getContainer());
			bags.get(2).put(bags.get(4).getContainer());
			System.out.println("Am adaugat cele doua containere in cel de tipul FIFO");

			System.out.println("Rezultatul dupa ce metoda a fost aplicata:");
			System.out.println();
			System.out.print("Random este gol? - ");
			System.out.println(bags.get(0).isEmpty());
			System.out.print("FIFO este gol? - ");
			System.out.println(bags.get(2).isEmpty());
			System.out.print("LIFO este gol? - ");
			System.out.println(bags.get(4).isEmpty());
			System.out.println();
			System.out.println("Containerul de tipul FIFO:");
			System.out.println(bags.get(2).getContainer());
			System.out.println();
			
		} else {
			System.out.println("Se va trece la urmator pas al aplicatiei!");
		}
	}
	
	public static void  printAll(ArrayList<AbstractGiveSurprises> bags) {
		System.out.println("La final vom imparti surprizele ce au fost adaugat anterior in container!");
		System.out.println("Surprizele se vor imparti la un interval de timp ales anterior in program!");
		System.out.println("Enjoy!");
		System.out.println();
		bags.get(2).giveAll();
		System.out.print(bags.get(2).getContainer());
		System.out.println(" - Acum containerul este gol!");
		System.out.println("La revedere");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		intro();
		ArrayList<AbstractGiveSurprises> bags = makeBags(time(sc));
		addSurprises(sc,bags);
		takeOut(sc, bags);
		mergeContainers(sc,bags);
		printAll(bags);
	}
}