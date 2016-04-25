package ua.in.dergachovda.less11.Game;

import java.util.Arrays;

public class Board {

    private char[][] board = new char[3][3];
    private char currentPlayer;

    public Board() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
        currentPlayer = 'X';
    }

    public boolean gameFinished() {
		char ch = getWinnerPlayer();
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == ch && board[i][1] == ch && board[i][2] == ch)
                return true;
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == ch && board[1][i] == ch && board[2][i] == ch)
                return true;
        }

        if (board[0][0] == ch && board[1][1] == ch && board[2][2] == ch)
                return true;
             
        if (board[2][0] == ch && board[1][1] == ch && board[0][2] == ch)
                return true;

        return false;
    }

    public boolean makeMove(String move) {
        int x = Character.getNumericValue(move.charAt(0)) - 1;
        int y = Character.getNumericValue(move.charAt(1)) - 1;

        if (!isMoveValid(x, y))
			return false;
		
		board[x][y] = currentPlayer;
        changeCurrentPlayer();
        return true;
    }

    private void changeCurrentPlayer() {
        if (currentPlayer == 'X')
            currentPlayer = 'O';
        else
            currentPlayer = 'X';
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }
	
	public char getWinnerPlayer() {
		if (currentPlayer == 'X')
			return 'O';
		else
			return 'X';
    }

    private boolean isMoveValid(int x, int y) {
        if (x > 2 || y > 2 || x < 0 || y < 0)
            return false;
		if (board[x][y] != ' ')
			return false;
        return true;
    }

    public void printBoard() {
		System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.print("|\n");
            System.out.println("-------");
        }
    }

}
