import java.util.Arrays;
import java.util.Scanner;
public class Triangles {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		double a, b, c;
		System.out.println("Triangles!");
		System.out.print("Side 1: ");
		a = console.nextInt();
		System.out.print("Side 2: ");
		b = console.nextInt();
		System.out.print("Side 3: ");
		c = console.nextInt();
		getAngles(a, b, c);
		
		console.close();
	}
	
	public static void getAngles(double a, double b, double c){
		double sides[] = {a, b, c};
		Arrays.sort(sides);
		if((sides[0] + sides[1]) <= sides[2]){
			System.out.println("Not a triangle");
		}
		else{
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
