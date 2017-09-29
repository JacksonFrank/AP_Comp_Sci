/*
 Jackson Frank
 Class: InputLength
 Purpose: To count the amount of words, characters, and lines in a paper
 */
import java.io.*;
import java.util.Scanner;

public class InputLength {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Text File Reader!");
		System.out.print("File name: ");
		String FName = console.next();
		
		Scanner input = new Scanner(new File(FName));
		
		System.out.println("");
		
		int words = 0, lines = 0, characters = 0;
		while(input.hasNextLine()){
			String line = input.nextLine();
			words += Words(line);
			characters += Characters(line);
			lines ++;
		}
		System.out.println("Characters: " + characters);
		System.out.println("Words: " + words);
		System.out.println("Lines: " + lines);
		
		input.close();
		console.close();
		
	}
	public static int Words(String line){
		int w = 0;
		Boolean hasW = false;
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i) == ' '){
				w++;
				hasW = true;
			}
		}
		if(hasW){
			w++;
		}
		
		return w;
	}
	public static int Characters(String line){
		int c = 0;
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i) != ' '){
				c++;
			}
		}
		
		return c;
	}

}
