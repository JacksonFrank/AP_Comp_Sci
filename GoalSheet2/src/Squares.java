/*
 Jackson Frank
 Class: Squares.java
 Purpose: To output squares the amount of times the user specifies
 Pseudocode: Takes in user input of how many numbers they want in the sequence,
 			 sends this inputted integer to a method that using nested loops outputs
 			 perfect squares the amount of times the user specifies
*/

import java.util.Scanner;
public class Squares {

	public static void main(String[] args) {
		
		//gets user input for the amount of squares they want in the sequence
		Scanner console = new Scanner(System.in);
		System.out.print("Number of squares: ");
		int numbOfSq = console.nextInt();
		
		/* sends the amount of numbers in the sequence as an integer to a method
		   that will output the appropriate amount of squares */
		findSquares(numbOfSq);
		
		
		console.close();

	}
	public static void findSquares(int amount){
		//this loop repeats each time a new number in the sequence needs to be outputted
		for(int i = 0; i < amount; i++){
			
			//this declaration needs to exist on this scope in order to output it correctly
			int output = 0;
			
			/*
			 This loop using the concept that the difference between 2 consecutive
			 squares increases by 2 by each number in the sequence.
			 For example, 4 - 1 = 3, then 9 - 4 = 5, then 16 - 9 = 7, etc.
			 */
			for(int g = 1,h = 0;h <= i; g += 2, h++){
				output += g;
			}
			System.out.print(output + " ");
		}
	}

}
