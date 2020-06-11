package bag;
import surprise.*;
import java.util.*;

public class LIFOBag extends GenericBag {

	public LIFOBag() {
		this.surprise = new ArrayList<ISurprise>();
	}
	
	@Override
	public ISurprise takeOut() {
		if(this.isEmpty()) {
			System.out.println("Containerul este gol!");
			return null;
		}
		return(this.surprise.remove(this.surprise.size() - 1));
	}
}
	