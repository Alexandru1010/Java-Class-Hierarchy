package bag;
import surprise.*;
import java.util.*;
public class FIFOBag extends GenericBag{
	
	public FIFOBag() {
		this.surprise = new ArrayList<ISurprise>();
	}
	
	@Override
	public ISurprise takeOut() {
		if(this.isEmpty()) {
			System.out.println("Containerul este gol!");
			return null;
		}
		return (this.surprise.remove(0));
	}
	
	
	
}
