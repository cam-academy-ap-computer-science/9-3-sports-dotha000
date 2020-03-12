
public class Tennis extends Player{
	private String racket;
	public Tennis(String name, double height, double shoeSize, String racket) {
		super(name, height, shoeSize);
		racket = "";
	}
	
	public String toString() {
		return (super.toString() + "\nracket brand: " + racket + "\n");
	}
	public boolean equals(Object o) {
		if (o instanceof Tennis) {
			Tennis other = (Tennis) o;
			return (super.equals(other) && racket == other.racket);
		} else {
			return false;
		}
	}
}
