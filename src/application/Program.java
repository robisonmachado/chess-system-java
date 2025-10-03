package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			
			var source = UI.readChessPosition(scanner);
			
			System.out.println();
			System.out.print("Target: ");
			
			var target = UI.readChessPosition(scanner);
			
			var capturedPiece = chessMatch.performChessMove(source, target);
		}
		
	}

}
