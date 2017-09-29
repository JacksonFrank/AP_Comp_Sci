/*
 Jackson Frank
 Class: Quadratic.java
 Purpose: to output the roots of a quadratic equation given in standard form
 Pseudocode: Inputs quadratic equation in standard form in terms of a, b, c,;
			 sends these 3 inputs into method that will output the roots using 
			 the quadratic formula, the method will also check to see if the equation
			 inputted is quadratic and actually has roots
 */

import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Quadratics!");
		
		//inputs quadratic equation in standard form
		Scanner console = new Scanner(System.in);
		int a, b, c;
		System.out.print("a: ");
		a = console.nextInt();
		System.out.print("b: ");
		b = console.nextInt();
		System.out.print("c: ");
		c = console.nextInt();
		console.close();
		
		/* method that takes quadratic equation in standard form as arguments
		   and outputs roots */
		getRoots(a, b, c);
	}
	public static void getRoots(int a, int b, int c){
		//checks to see if equation is quadratic (a can't be 0)
		if(a == 0){
			System.out.println("Not quadratic");
		}
		
		/* checks to see if equation has roots (value being square rooted in
		   quadratic formula isn't negative) */
		else if(((b * b) - (4 * a * c)) < 0){
			System.out.println("No roots");
		}
		else {
			//finds roots using quadratic formula
			double firstRoot = ((0 - b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			double secondRoot = ((0 - b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			
			//checks to see if there is only 1 root
			if(firstRoot == secondRoot){
				System.out.println("Root: " + firstRoot);
			}
			else {
			System.out.println("Roots: " + firstRoot + ", " + secondRoot);
			}
		}
	}

}
