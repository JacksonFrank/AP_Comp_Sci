/*
 Jackson Frank
 Class: RomanNumerals
 Purpose: To convert an inputed integer into a Roman Numeral
 
 I - 1
 V - 5
 X - 10
 L - 50
 C - 100
 D - 500
 M - 1000
 */
import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		System.out.println("Roman Numerals!");
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Your integer: ");
		int num = console.nextInt();
		printRomanNum(num);
		
		console.close();

	}
	public static void printRomanNum(int num){
		if(num <= 0 || 3999 < num){
			System.out.print("Input not legal");
		}
		else{
			String RNum = "";
			switch(num / 1000){
			case 3:
				RNum += "MMM";
				num -= 3000;
				break;
			case 2:
				RNum += "MM";
				num -= 2000;
				break;
			case 1:
				RNum += "M";
				num -= 1000;
				break;
			}
			switch(num / 100){
			case 9:
				RNum += "CM";
				num -= 900;
				break;
			}
			
			switch(num / 500){
			case 1:
				RNum += "D";
				num -= 500;
				break;
			}
			
			switch(num / 100){
			case 4:
				RNum += "CD";
				num -= 400;
				break;
			case 3:
				RNum += "CCC";
				num -= 300;
				break;
			case 2:
				RNum += "CC";
				num -= 200;
				break;
			case 1:
				RNum += "C";
				num -= 100;
				break;
			}
			switch(num / 10){
			case 9:
				RNum += "XC";
				num -= 90;
				break;
			}
			
			switch(num / 50){
			case 1:
				RNum += "L";
				num -= 50;
				break;
			}
			
			switch(num / 10){
			case 4:
				RNum += "XL";
				num -= 40;
				break;
			case 3:
				RNum += "XXX";
				num -= 30;
				break;
			case 2:
				RNum += "XX";
				num -= 20;
				break;
			case 1:
				RNum += "X";
				num -= 10;
				break;
			}
			switch(num){
			case 9:
				RNum += "IX";
				num -= 9;
				break;
			}
			
			switch(num / 5){
			case 1:
				RNum += "V";
				num -= 5;
				break;
			}
			
			switch(num){
			case 4:
				RNum += "IV";
				num -= 4;
				break;
			case 3:
				RNum += "III";
				num -= 3;
				break;
			case 2:
				RNum += "II";
				num -= 2;
				break;
			case 1:
				RNum += "I";
				num -= 1;
				break;
			}
			if(num == 0){
				System.out.print("Roman Numeral: " + RNum);
			}
			else{
				System.out.print("Error");
			}
		}
	}

}
