package string_methods;
import java.util.Scanner;

/**
 * 
 * @author agnieszkaslusarczyk
 * @category Write a program that asks for a name and then spells it.
 */
public class Spelling {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter your name: ");
		String name = reader.next(); // Scans the next token of the input as an String.
		while (!name.equalsIgnoreCase("exit")) {
			Spelling.spell_it (name);	
			
			// Ask for another name
			System.out.println("\nEnter another name: ");
			name = reader.next(); // Scans the next token of the input as an String.
		}
		reader.close();	//once finished
		System.out.println("Fin");
		System.exit(1);
	}
	
	
	public static void spell_it (String name) {
			System.out.println("\nSpelling the name : " + name );
			
			// Spelling with loop 'for each' after transforming a String to an array
			/*
			char[] letters = name.toCharArray();
			for (char letter : letters ) {
				System.out.print(letter + "-");
			}
			*/
			
			// Spelling with loop 'while': the last caracter is printed out of loop
			int i = 0;
			// takes all caracters, except the last caracter, adding "-"
			while(i < name.length()-1) { 
				System.out.print(name.charAt(i) + "-");
				i++;
			}
			// the last caracter without "-"
			System.out.println(name.charAt(i)); 	
		
	}
	
	
}
