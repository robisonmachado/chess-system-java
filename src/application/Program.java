package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				
				var source = UI.readChessPosition(scanner);
				
				var possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				
				var target = UI.readChessPosition(scanner);
				
				var capturedPiece = chessMatch.performChessMove(source, target);				
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
				
		}
		
	}

}
