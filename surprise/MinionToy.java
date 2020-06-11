package surprise;

public class MinionToy implements ISurprise {

	private static final String[] minions = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
	private String name;
	private	static int count;
	
	public MinionToy() {
	}
	
	public MinionToy(String name) {
		this.name = name;
	}
	
	@Override
	public void enjoy() {
		generate();
		MinionToy.count++;
		if(MinionToy.count == MinionToy.minions.length) {
			MinionToy.count = 0;
		}
	}
	
	public  MinionToy generate() {
		this.name = MinionToy.minions[count];
		MinionToy newToy = new MinionToy(this.name); 
		System.out.println("Ai primit minionul cu numele " + this.name);
		return newToy;
	}
	
	@Override
	public String toString() {
		 return "MinionToy";
	}
}
