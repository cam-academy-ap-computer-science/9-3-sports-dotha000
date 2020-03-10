
public class Football extends Player{
	private int touchdown;
	public Football(String name, double height, double shoeSize, int touchdown) {
		super(name, height, shoeSize);
		touchdown = 0;
	}
	
	public String toString() {
		return (super.toString() + "\ntouchdown: " + touchdown + "\n");
	}
}
