
public class Football extends Player{
	private int touchdown;
	public Football(String name, double height, double shoeSize, int touchdown) {
		super(name, height, shoeSize);
		touchdown = 0;
	}
	
	public String toString() {
		return (super.toString() + "\ntouchdowns: " + touchdown + "\n");
	}
	
	public boolean equals(Object o) {
		if (o instanceof Football) {
			Football other = (Football) o;
			return (super.equals(other) && touchdown == other.touchdown);
		} else {
			return false;
		}
	}
}
