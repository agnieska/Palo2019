package string_methods;
import java.util.Scanner;

/**
 * 
 * @author agnieszkaslusarczyk
 * @category Write a method that reverses a string
 */
public class ReverseStr {
	
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("\nEnter text to reverse: ");
		String name = reader.next(); // Scans the next token of the input as an String.
		while (!name.equalsIgnoreCase("exit")) {
			ReverseStr.reverse (name);	
			
			// Ask for another String
			System.out.println("\nEnter another text to reverse: ");
			name = reader.next(); // Scans the next token of the input as an String.
		}
		reader.close();	//once finished
		System.out.println("\nFin");
		System.exit(1);
	}
	
	
	public static void reverse (String text) {
		for (int i = text.length()-1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
		
	}
}
