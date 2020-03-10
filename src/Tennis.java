
public class Tennis extends Player{
	private String racket;
	public Tennis(String name, double height, double shoeSize, String racket) {
		super(name, height, shoeSize);
		racket = "";
	}
	
	public String toString() {
		return (super.toString() + "\nracket brand: " + racket + "\n");
	}
}
