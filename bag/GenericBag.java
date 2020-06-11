package bag;
import java.util.ArrayList;

import surprise.*;

public abstract class GenericBag implements IBag {
	
	 ArrayList<ISurprise> surprise;
	
	@Override
	public  boolean isEmpty() {
		return(this.surprise.isEmpty());
	}
	
	@Override
	public int size() {
		return this.surprise.size();
	}
	
	@Override
	public  void put(ISurprise newSurprise) {
		if(newSurprise == null) {
			System.out.println("Surpriza invalida!");
		}
		this.surprise.add(newSurprise);
	}
	
	@Override
	public void put(IBag bagOfSurprises) {
		while(!bagOfSurprises.isEmpty()) {
			this.put(bagOfSurprises.takeOut());
		}
	}
	
	@Override
	public String toString() {
		String str = "[ ";
		for(int i = 0; i < this.surprise.size(); i++) {
			str += this.surprise.get(i) + " ";
		}
		return str + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((surprise == null) ? 0 : surprise.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenericBag other = (GenericBag) obj;
		if (surprise == null) {
			if (other.surprise != null)
				return false;
		} else if (!surprise.equals(other.surprise))
			return false;
		return true;
	}
	
	
}
