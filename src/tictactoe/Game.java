package tictactoe;

import java.util.Scanner;

public class Game {
	private Player player1;
	private Player player2;
	private Player currentTurn;
	private Board board;
	

	public Game(Player player1, Player player2, Player currentTurn) {
		this.player1 = player1;
		this.player2 = player2;
		this.currentTurn = currentTurn;
		this.board = new Board();
	}
	
	public boolean play(int row, int column) {
		if(board.mark(row, column, currentTurn.getSymbol())) {
			if(board.win()) {
				System.out.println(currentTurn.getName() + " wins!");
				return true;
			}
			else if(board.draw()) {
				System.out.println("Nobody wins! It's a draw.");
				return true;
			}
			switchTurn(); 
		}
		else{
			System.out.println("Invalid Move. Try Again.");
		}
		return false; 
	}
	
	public void switchTurn() {
		currentTurn = (currentTurn == player1)? player2 : player1;
	}
	
	public void startGame() {
		Scanner scanner = new Scanner(System.in);
		boolean gameEnded = false;
		while(!gameEnded) {
			System.out.print(currentTurn.getName() + " move: ");
			int column = scanner.nextInt();
			int row = scanner.nextInt();
			if(play(row, column)) {
				gameEnded = true;
			}
			board.displayBoard();
		} 
		scanner.close();
		
	}

}
