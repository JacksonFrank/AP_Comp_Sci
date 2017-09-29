/*
 Jackson Frank
 Class: Hangman.java
 Purpose: To make a game of hangman using arrays
 */
import java.util.*;
import java.io.*;

public class Hangman {
	
	public static int SIZE = 30;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		Scanner file = new Scanner(new File("HangmanStrings"));
		
		System.out.println("Hangman!");
		System.out.println();
		System.out.println();
		
		String input[] = new String[SIZE];
		int index = 0;
		int wrong = 0;
		String rLetters = "";
		
		for (int i = 0; file.hasNextLine(); i++){
			input[i] = file.nextLine();
			index++;
		}
		Random rand = new Random();
		int lineNum = rand.nextInt(index);
		char line[] = input[lineNum].toCharArray();
		
		int _size = line.length;
		boolean gCorrect[] = new boolean[_size];
		for(int i = 0; i < _size; i++){
			if(Character.isLetter(line[i])){
				gCorrect[i] = false;
			}
			else{
				gCorrect[i] = true;
			}
		}
		
		while(wrong < 7){
			printHangman(wrong);
			System.out.println();
			printSpaces(line, gCorrect, rLetters);
			if(winGame(gCorrect)){
				break;
			}
			
			System.out.println();
			System.out.print("Your guess: ");
			char guess = console.next().charAt(0);
			
			if(letterCheck(guess, line)){
				boolean firstGuess = true;
				for(int i = 0; i < rLetters.length(); i++){
					if(Character.toLowerCase(guess) == rLetters.charAt(i)){
						firstGuess = false;
					}
				}
				if(firstGuess){
					for(int i = 0; i < line.length; i++){
						if(Character.toLowerCase(guess) == Character.toLowerCase(line[i])){
							gCorrect[i] = true;
						}
					}
					rLetters += Character.toLowerCase(guess) + " ";
				}
				}
				
			else{
				boolean firstGuess = true;
				for(int i = 0; i < rLetters.length(); i++){
					if(Character.toLowerCase(guess) == rLetters.charAt(i)){
						firstGuess = false;
					}
				}
				if(firstGuess){
					wrong++;
					rLetters += Character.toLowerCase(guess) + " ";
				}
			}
			
			
		}
		
		if(wrong < 7){
			System.out.print("You Win!");
		}
		else {
			System.out.println("You Lose");
			System.out.print("Correct phrase: " + input[lineNum]);
		}
		
		file.close();
		console.close();
		
		
	}
	public static void printSpaces(char line[], boolean gCorrect[], String rLetters){
		int count = line.length;
		
		for(int i = 0; i < count; i++){
			if(Character.isLetter(line[i]) && gCorrect[i] == false){
				System.out.print("_ ");
			}
			else{
				System.out.print(line[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Letters guessed: " + rLetters);
	}
	public static void printHangman(int wrong){

		char hangAscii[] = new char[7];
		for(int i = 0; i < 7; i++){
			hangAscii[i] = ' ';
		}
		switch(wrong){
		case 7:
			hangAscii[6] = '\\';
		case 6:
			hangAscii[5] = '/';
		case 5:
			hangAscii[4] = '\\';
		case 4:
			hangAscii[3] = '/';
		case 3:
			hangAscii[2] = '|';
		case 2:
			hangAscii[1] = '0';
		case 1:
			hangAscii[0] = '|';
			break;
			
		}
		System.out.println("  +---+");
		System.out.println("  " + hangAscii[0] + "   |");
		System.out.println("  " + hangAscii[1] + "   |");
		System.out.println(" " + hangAscii[3] + hangAscii[2] + hangAscii[4] + "  |");
		System.out.println(" " + hangAscii[5] + " " + hangAscii[6] + "  |");
		System.out.println("      |");
		System.out.println("=========");
	}
	public static boolean letterCheck(char guess, char line[]){
		boolean isRight = false;
		for(int i = 0; i < line.length; i++){
			if(Character.toLowerCase(line[i]) == Character.toLowerCase(guess)){
				isRight = true;
				break;
			}
		}
		return isRight;
	}
	public static boolean winGame(boolean gCorrect[]){
		boolean win = true;
		for(int i = 0; i < gCorrect.length; i++){
			if(gCorrect[i] == false){
				win = false;
				break;
			}
		}
		return win;
	}
}
