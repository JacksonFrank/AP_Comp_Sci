/*
 Jackson Frank
 Class: Triangles.java
 Purpose: To output the angle measurements of a triangle based on the user inputted
 		  side measurements
 Pseudocode: Gets user input of the sides of the triangle, sends the side measurements 
 			 to a method that first checks to see if a triangle can possibly exist with
 			 the measurements given, then uses the law of Cosines to calculate all of 
 			 the angle measures and outputs them
 */

import java.util.Arrays;
import java.util.Scanner;
public class Triangles {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		
		//gets the user input for the triangle side measurements
		double a, b, c;
		System.out.println("Triangles!");
		System.out.print("Side 1: ");
		a = console.nextInt();
		System.out.print("Side 2: ");
		b = console.nextInt();
		System.out.print("Side 3: ");
		c = console.nextInt();
		
		//sends measurements to a method that will output the angle measurements
		getAngles(a, b, c);
		
		console.close();
	}
	
	public static void getAngles(double a, double b, double c){
		
		/*
		 To be a triangle, no one side can be larger than the other 2 sides combined.
		 To mirror this, all 3 measurements were put into an array, and sorted from 
		 least to greatest using the Array wrapper class. If the first 2 doubles in the
		 array added together were less than or equal to the 3rd double, then the sides 
		 couldn't make up a triangle.
		 */
		double sides[] = {a, b, c};
		Arrays.sort(sides);
		if((sides[0] + sides[1]) <= sides[2]){
			System.out.println("Not a triangle");
		}
		else{
			/*
			 Uses the law of Cosines ( c^2 = a^2 + b^2 - 2ab(cos(C)) ) to determine
			 angles of triangle using its sides, converts the angles to degrees and 
			 outputs the angles
			 */
			double a1, a2, a3;
			a1 = Math.acos(((a * a) + (b * b) - (c * c)) / (2 * a * b));
			a2 = Math.acos(((c * c) + (b * b) - (a * a)) / (2 * c * b));
			a3 = Math.acos(((a * a) + (c * c) - (b * b)) / (2 * a * c));
			
			a1 = Math.toDegrees(a1);
			a2 = Math.toDegrees(a2);
			a3 = Math.toDegrees(a3);
			
			System.out.println("Angle 1: " + a1);
			System.out.println("Angle 2: " + a2);
			System.out.println("Angle 3: " + a3);
			
		}
		
	}
	

}
