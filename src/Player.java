
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
	
	public boolean equals(Object o) {
		if (o instanceof Player) {
			Player other = (Player) o;
			return (name == other.name && height == other.height && shoeSize == other.shoeSize);
		} else {
			return false;
		}
	}
}
