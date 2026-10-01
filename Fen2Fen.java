import java.util.Scanner;

public class Fen2Fen {
	public static void main(String[] args) {
	Scanner boardReader = new Scanner(System.in);
	System.out.println("Please introduce the current state of your board in the FEN format: \n $ ");
	
	String board = boardReader.nextLine();
	System.out.println(board);
	}
}
