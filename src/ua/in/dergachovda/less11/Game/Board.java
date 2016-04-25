package ua.in.dergachovda.less11.Game;

import java.util.Arrays;

public class Board {

    char[][] board = new char[3][3];
    char currentPlayer;

    public Board() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
        currentPlayer = 'X';
    }

    public boolean gameFinished() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true;
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[1][i] == currentPlayer)
                return true;
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][i] == currentPlayer && board[i][i] == currentPlayer && board[i][i] == currentPlayer)
                return true;
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][2 - i] == currentPlayer && board[i][2 - i] == currentPlayer && board[i][2 - i] == currentPlayer)
                return true;
        }

        return false;
    }

    public boolean makeMove(String move) {
        int x = Character.getNumericValue(move.charAt(0));
        int y = Character.getNumericValue(move.charAt(1));

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

    public String calculateWinner() {
        return "X";
    }

    private boolean isMoveValid(int x, int y) {
        if (x > 2 || y > 2 || x < 0 || y < 0)
            return false;
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|\t" + board[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

}
