
/*
 Jackson Frank
 Class: StringRepeater
 Purpose: To output an inputed string and inputed amount of times
 Pseudocode: Gets input of string and amount of times user wants it to repeat, 
 	checks to see if user wants to repeat 0 or less times, if not, then the method 
 	adds the inputed string to the outputted string the amount of times the user wanted
 	the string to repeat using a for loop, the method returns the repeating string, and 
 	it is outputted.
 */

import java.util.Scanner;

public class StringRepeater {

	public static void main(String[] args) {
		System.out.println("String Repeater!");
		
		Scanner console = new Scanner(System.in);
		
		
		System.out.print("Your string: ");
		String phrase = console.nextLine();
		System.out.print("Amount of repeats: ");
		int repeats = console.nextInt();
		String repPhrase = repl(phrase, repeats);
		System.out.print(repPhrase);
		
		console.close();

	}
	public static String repl(String phrase, int repeats) {
		/*int arrayLength = 1000; 
		
		String repPhrase;
		char array[] = phrase.toCharArray();
		char repArray[] = new char[arrayLength]; 
		int stringLength = phrase.length();
		*/
		String output = new String();
		if(repeats <= 0) {
			return "";
		}
		/*else if((repeats * stringLength) > arrayLength) { 
			return "Memory error";
		} */
		else {	
			for(int i = 0; i < repeats; i++) {
				output += phrase;
			}
		
			return output;
		}
		

	}
}