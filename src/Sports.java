// The client 'main' tester routine - load your sports database, and produce desired output.
public class Sports {

	public static void main(String[] args) {
		Player x = new Player("Kobe Bryant", 6.9, 11);
		System.out.println(x);
		Basketball y = new Basketball("Kobe Bryant", 6.9, 11, 33.5);
		System.out.println(y);
		Basketball MJ = new Basketball("Michael Jordan", 7.0, 12, 33.5);
		System.out.println(y.equals(MJ));
	}

}
