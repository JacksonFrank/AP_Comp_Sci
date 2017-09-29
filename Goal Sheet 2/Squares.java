import java.util.Scanner;
public class Squares {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Number of squares: ");
		int numbOfSq = console.nextInt();
		findSquares(numbOfSq);
		console.close();

	}
	public static void findSquares(int amount){
		for(int i = 0; i < amount; i++){
			int output = 0;
			for(int g = 1, h = 0;h <= i; g += 2, h++){
				output += g;
			}
			System.out.println(output);
		}
	}

}
