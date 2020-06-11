package bag;

public class BagFactory implements IBagFactory{

	private IBag newContainer;
	
	public BagFactory() {
		
	}
	
	public IBag makeBag(String container) {
		if(container == null) {
			return null;
		}
				
		switch (container.toUpperCase()) {
			case "RANDOM":
				newContainer = new RandomBag();
				return newContainer;
			case "LIFO":
				newContainer = new LIFOBag();
				return newContainer;
			case "FIFO":
				newContainer = new FIFOBag();
				return newContainer;
			default:
				System.out.println("Introduceti corect numele containerului");
				return null;
		}
		
	}	
}
