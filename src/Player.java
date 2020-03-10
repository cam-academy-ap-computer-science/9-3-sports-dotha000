
public class Player {
	private String name;
	private double height;
	private double shoeSize;
	public Player (String name, double height, double shoeSize) {
		this.name = name;
		this.height = height;
		this.shoeSize = shoeSize;
	}
	
	public String toString() {
		return ("name: " +  name + "\nheight: " + height + " ft\nshoeSize: " + shoeSize + "\n");
	}
}
