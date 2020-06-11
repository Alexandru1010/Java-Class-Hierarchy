package bag;
import surprise.*;

public interface IBag {
	
	void put (ISurprise newSurprise);
	
	void put(IBag bagOfSurprise);
	
	ISurprise takeOut();
	
	boolean isEmpty();
	
	int size();
		

}
