package ua.in.dergachovda.less11.Game;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Game started...");

        Board board = new Board();

        while (!board.gameFinished()) {
            System.out.println("Player " + board.getCurrentPlayer() + " move...");
            System.out.println("Enter your move: ");
            String move = scanner.next();
            if (!board.makeMove(move))
                System.out.println("Input incorrect/ Repeat your move.");
            board.printBoard();
        }

        System.out.println("The winner is " + board.getWinnerPlayer());

    }

}
