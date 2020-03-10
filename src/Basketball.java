
public class Basketball extends Player{
	private double averageShots;
	public Basketball(String name, double height, double shoeSize, double averageShots) {
		super(name, height, shoeSize);
		averageShots = 0;
	}
	
	public String toString() {
		return (super.toString() + "average shots per game: " + averageShots + "\n");
	}
}
