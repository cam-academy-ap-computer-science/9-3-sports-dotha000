
public class SportsGame {
	private Player[] players;
	private boolean team;
	public SportsGame(boolean team) {
		this.team = team;
	}
	
	public Player[] loadPlayers(Player[] x) {
		for (int i = 0; i < x.length; i++) {
			players[i] = x[i];
		}
		return players;
	}
}
