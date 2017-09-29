/*
 Jackson Frank
 Class: PrintingIntegers
 Purpose: To input the sequence of numbers between 2 inputted integers in order
 Pseudocode: 
 */

import java.util.Scanner;

public class PrintingIntegers {

	public static void main(String[] args) {
		System.out.println("Integer Printer!");
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Integer 1: ");
		int a = console.nextInt();
		System.out.print("Integer 2: ");
		int b = console.nextInt();
		printRange(a, b);
		
		console.close();
	}
	public static void printRange(int a, int b){
		int range;
		if(a != b){
			range = b - a;
			System.out.print("[");
			if(range < 0){
				range *= -1;
				
				for(int i = 0; i <= range; i++){
					System.out.print(a - i);
					if(i != range){
						System.out.print(", ");
					}
				}
			}
			else{
				for(int i = 0; i <= range; i++){
					System.out.print(a + i);
					if(i != range){
						System.out.print(", ");
					}
				}
			}
			System.out.print("]");
		}
		else {
			System.out.println("[" + a + "]");
			
		}
			
	}

}
