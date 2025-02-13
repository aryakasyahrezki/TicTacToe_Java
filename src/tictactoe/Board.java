package tictactoe;

public class Board {
	private char[][] board;
	
	public Board() {
		board = new char[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-'; 
			}
		}
	}
	
	public boolean mark(int r, int c, char symbol) {
		if(r < 0 || r > 2 || c < 0 || c > 2)return false;
		
		if(board[r][c] == '-') {
			board[r][c] = symbol;
			return true;
		}
		else return false;
	}
	
	public void displayBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
				if(j < 2)System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public boolean win() { 
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') return true;
				if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') return true;
			}
		}
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') return true;
		if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') return true;
		
		return false;
	}
	
	public boolean draw() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-')return false;
			}
		}
		
		return true;
	}

}
