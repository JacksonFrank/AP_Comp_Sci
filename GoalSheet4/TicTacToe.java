/*
 Jackson Frank
 Class: TicTacToe.java
 Purpose: To create a tic tac toe game using 2 dimensional arrays
 */

import java.util.*;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Tic Tac Toe!");
		
		char turn = 'o';
		boolean gameCont = true;
		
		char ttt[][] = new char[3][3];
		for(int i = 0; i < 3; i++){
			for(int g = 0; g < 3; g++){
				ttt[i][g] = ' ';
			}
		}
		
		while(gameCont){
			if(turn == 'x'){
				turn = 'o';
			}
			else{
				turn = 'x';
			}
			
			printBoard(ttt);
			
			boolean spaceTaken = true;
			while(spaceTaken){
				System.out.println("Which space would " + turn + " want to go?");
				System.out.print("Row: ");
				int row = (console.nextInt()) - 1;
				System.out.print("Column: ");
				int column = (console.nextInt()) - 1;
				
				if(ttt[row][column] == ' '){
					spaceTaken = false;
					ttt[row][column] = turn;
					break;
				}
				else{
					System.out.println("Space has already been taken!");
				}
			}
			if(checkForCont(ttt) == false){
				gameCont = false;
				break;
			}
		}
		
		printBoard(ttt);
		System.out.print(turn + " Wins!");
		
		console.close();
		
	}
	public static void printBoard(char ttt[][]){
		System.out.println();
		
		for(int i = 0; i < 3; i++){
			System.out.println("   |   |   ");
			for(int g = 0; g < 3; g++){
				System.out.print(" " + ttt[i][g]);
				if(g < 2){
					System.out.print(" |");
				}
			}
			System.out.println();
			if(i < 2){
				System.out.println("___|___|___");
			}
			else{
				System.out.println("   |   |   ");
			}
		}
		System.out.println();
		
		
		
	}
	public static boolean checkForCont(char ttt[][]){
		for(int i = 0; i < 3; i++){
			if(ttt[i][0] == ttt[i][1] && ttt[i][1] == ttt[i][2]){
				if(ttt[i][0] == 'x' || ttt[i][0] == 'o'){
					return false;
				}
			}
			if(ttt[0][i] == ttt[1][i] && ttt[1][i] == ttt[2][i]){
				if(ttt[0][i] == 'x' || ttt[0][i] == 'o'){
					return false;
				}
			}
		}
		if(ttt[0][0] == ttt[1][1] && ttt[1][1] == ttt[2][2]){
			if(ttt[0][0] == 'x' || ttt[0][0] == 'o'){
				return false;
			}
		}
		if(ttt[0][2] == ttt[1][1] && ttt[1][1] == ttt[2][0]){
			if(ttt[0][2] == 'x' || ttt[0][2] == 'o'){
				return false;
			}
		}
		return true;
	}
	

}
