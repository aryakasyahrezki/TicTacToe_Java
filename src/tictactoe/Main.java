package tictactoe;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player("Player 1", 'O');
		Player player2 = new Player("Player 2", 'X');
		Game game = new Game(player1, player2, player1);
		game.startGame();
	}

}
