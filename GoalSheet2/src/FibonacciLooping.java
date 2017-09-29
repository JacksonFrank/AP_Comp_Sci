/*
 Jackson Frank
 Class: FibonacciLooping.java
 Purpose: To output Fibonacci sequence using loops
 Pseudocode: Inputs index that user wants sequence to go to, using loops
  	outputs Fibbonacci sequence to index specified
 */

import java.util.*;

public class FibonacciLooping {

	public static void main(String[] args) {
		System.out.println("Fibonacci!");
		System.out.println();
		
		//inputs index
		int numbOfNumb;
		Scanner reader = new Scanner(System.in);
		System.out.print("Number of numbers in sequence: ");
		numbOfNumb = reader.nextInt();
		
		//sends index to method that will print the correct sequence
		printFib(numbOfNumb);
		
		reader.close();
	}
	public static void printFib(int index){
		int s1 = 0;
		int s2 = 1;
		int s3;
		System.out.print("Sequence: ");
		
		/* this switch is in place in case the index is 0 or 1, if index is 2 or more 
		  it will output the first 2 numbers in the sequence */
		switch(index){
		case 1:
			System.out.print(s1);
			break;
		case 0:
			break;
		default:
			System.out.print(s1 + " " + s2 + " ");	
		}
		
		//loop that decides sequence
		//we subtract 2 from index to account for previous switch
		/* the loop sets s3 to the sum of the previous 2 numbers of the sequence,
		   once s3 is outputted, then assign s1 and s2 to the next 2 appropriate 
		   numbers in the sequence */
		for(int i = 0; i < (index - 2); i++){
			s3 = s1 + s2;
			System.out.print(s3 + " ");
			s1 = s2;
			s2 = s3;
		}
		
	}

}
