import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Quadratics!");
		Scanner console = new Scanner(System.in);
		int a, b, c;
		System.out.print("a: ");
		a = console.nextInt();
		System.out.print("b: ");
		b = console.nextInt();
		System.out.print("c: ");
		c = console.nextInt();
		console.close();
		getRoots(a, b, c);
		console.close();

	}
	public static void getRoots(int a, int b, int c){
		if(((b * b) - (4 * a * c)) < 0){
			System.out.println("No roots");
		}
		else {
			double firstRoot = ((0 - b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			double secondRoot = ((0 - b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			if(firstRoot == secondRoot){
				System.out.println("Root: " + firstRoot);
			}
		
			else {
			System.out.println("Roots: " + firstRoot + ", " + secondRoot);
			}
		}
	}

}
