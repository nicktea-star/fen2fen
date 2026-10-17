// For loop to iterate over the characters of the fen
import java.util.*;

public class Fen2Fen {

	public static void main(String[] args) {
		// Get the fen from the user
		Scanner Reader = new Scanner(System.in);
		System.out.print("Please introduce the current state of your board in the FEN format: \n $ ");
		String fen = Reader.nextLine();
		System.out.print("Please introduce your move in the UCI format: \n $ ");
		String move = Reader.nextLine();
		Reader.close();

		// Create an empty board
		
		String[][] matrix = {
			{"h8",""},
			{"h7",""},
			{"h6",""},
			{"h5",""},
			{"h4",""},
			{"h3",""},
			{"h2",""},
			{"h1",""},
			{"g8",""},
			{"g7",""},
			{"g6",""},
			{"g5",""},
			{"g4",""},
			{"g3",""},
			{"g2",""},
			{"g1",""},
			{"f8",""},
			{"f7",""},
			{"f6",""},
			{"f5",""},
			{"f4",""},
			{"f3",""},
			{"f2",""},
			{"f1",""},
			{"e8",""},
			{"e7",""},
			{"e6",""},
			{"e5",""},
			{"e4",""},
			{"e3",""},
			{"e2",""},
			{"e1",""},
			{"d8",""},
			{"d7",""},
			{"d6",""},
			{"d5",""},
			{"d4",""},
			{"d3",""},
			{"d2",""},
			{"d1",""},
			{"c8",""},
			{"c7",""},
			{"c6",""},
			{"c5",""},
			{"c4",""},
			{"c3",""},
			{"c2",""},
			{"c1",""},
			{"b8",""},
			{"b7",""},
			{"b6",""},
			{"b5",""},
			{"b4",""},
			{"b3",""},
			{"b2",""},
			{"b1",""},
			{"a8",""},
			{"a7",""},
			{"a6",""},
			{"a5",""},
			{"a4",""},
			{"a3",""},
			{"a2",""},
			{"a1",""}
		};

		// Traverse the fen and put pieces on the board
		for (int i = 0; i < fen.length(); i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][1] == "") {
				}
			}
		}
	}
}
