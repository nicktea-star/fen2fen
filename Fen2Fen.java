// For loop to iterate over the characters of the fen
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Fen2Fen {

	public static void main(String[] args) {
		// Get the fen from the user
		Scanner fenReader = new Scanner(System.in);
		System.out.print("Please introduce the current state of your board in the FEN format: \n $ ");
		String fen = fenReader.nextLine();

		// Get the move from the user
		Scanner moveReader = new Scanner(System.in);
		System.out.print("Please introduce your move in the UCI format: \n $ ");
		String move = moveReader.nextLine();

		// Create an empty board
		Dictionary<String, String> b = new Hashtable<>();
		b.put("a1","");
		b.put("a2","");
		b.put("a3","");
		b.put("a4","");
		b.put("a5","");
		b.put("a6","");
		b.put("a7","");
		b.put("a8","");
		b.put("b1","");
		b.put("b2","");
		b.put("b3","");
		b.put("b4","");
		b.put("b5","");
		b.put("b6","");
		b.put("b7","");
		b.put("b8","");
		b.put("c1","");
		b.put("c2","");
		b.put("c3","");
		b.put("c4","");
		b.put("c5","");
		b.put("c6","");
		b.put("c7","");
		b.put("c8","");
		b.put("d1","");
		b.put("d2","");
		b.put("d3","");
		b.put("d4","");
		b.put("d5","");
		b.put("d6","");
		b.put("d7","");
		b.put("d8","");
		b.put("e1","");
		b.put("e2","");
		b.put("e3","");
		b.put("e4","");
		b.put("e5","");
		b.put("e6","");
		b.put("e7","");
		b.put("e8","");
		b.put("f1","");
		b.put("f2","");
		b.put("f3","");
		b.put("f4","");
		b.put("f5","");
		b.put("f6","");
		b.put("f7","");
		b.put("f8","");
		b.put("g1","");
		b.put("g2","");
		b.put("g3","");
		b.put("g4","");
		b.put("g5","");
		b.put("g6","");
		b.put("g7","");
		b.put("g8","");
		b.put("h1","");
		b.put("h2","");
		b.put("h3","");
		b.put("h4","");
		b.put("h5","");
		b.put("h6","");
		b.put("h7","");
		b.put("h8","");

		// Traverse the fen and put pieces on the board
		for (int i = 0; i < fen.length(); i++) {
			if (fen.charAt(i) == 'K') {
				System.out.println("K");
			} else if (fen.charAt(i) == 'Q') {
				System.out.println("Q");
			} else if (fen.charAt(i) == 'B') {
				System.out.println("B");
			} else if (fen.charAt(i) == 'N') {
				System.out.println("N");
			} else if (fen.charAt(i) == 'R') {
				System.out.println("R");
			} else if (fen.charAt(i) == 'P') {
				System.out.println("P");
			}

		}
	}
}

