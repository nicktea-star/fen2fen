	// For loop to iterate over the characters of the fen
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

// class Board {
// 	
// 	public Dictionary<String, String> b = new Hashtable<>();
// 	// We create a new board
// 	static void create() {
// 
// 		b.put("a1","");
// 		b.put("a2","");
// 		b.put("a3","");
// 		b.put("a4","");
// 		b.put("a5","");
// 		b.put("a6","");
// 		b.put("a7","");
// 		b.put("a8","");
// 		b.put("b1","");
// 		b.put("b2","");
// 		b.put("b3","");
// 		b.put("b4","");
// 		b.put("b5","");
// 		b.put("b6","");
// 		b.put("b7","");
// 		b.put("b8","");
// 		b.put("c1","");
// 		b.put("c2","");
// 		b.put("c3","");
// 		b.put("c4","");
// 		b.put("c5","");
// 		b.put("c6","");
// 		b.put("c7","");
// 		b.put("c8","");
// 		b.put("d1","");
// 		b.put("d2","");
// 		b.put("d3","");
// 		b.put("d4","");
// 		b.put("d5","");
// 		b.put("d6","");
// 		b.put("d7","");
// 		b.put("d8","");
// 		b.put("e1","");
// 		b.put("e2","");
// 		b.put("e3","");
// 		b.put("e4","");
// 		b.put("e5","");
// 		b.put("e6","");
// 		b.put("e7","");
// 		b.put("e8","");
// 		b.put("f1","");
// 		b.put("f2","");
// 		b.put("f3","");
// 		b.put("f4","");
// 		b.put("f5","");
// 		b.put("f6","");
// 		b.put("f7","");
// 		b.put("f8","");
// 		b.put("g1","");
// 		b.put("g2","");
// 		b.put("g3","");
// 		b.put("g4","");
// 		b.put("g5","");
// 		b.put("g6","");
// 		b.put("g7","");
// 		b.put("g8","");
// 		b.put("h1","");
// 		b.put("h2","");
// 		b.put("h3","");
// 		b.put("h4","");
// 		b.put("h5","");
// 		b.put("h6","");
// 		b.put("h7","");
// 		b.put("h8","");
// 	}
// }


public class Fen2Fen {

	static String traverseFen(String str) {
		String fen = "";
		for (int i = 0; i < str.length(); i++) {
			System.out.print("a");
		}
		return fen;
	}

	public static void main(String[] args) {
		Scanner boardReader = new Scanner(System.in);
		System.out.print("Please introduce the current state of your board in the FEN format: \n $ ");
		String board = boardReader.nextLine();
		
		String myFen = traverseFen(board);
		System.out.println(myFen);

	}
}

