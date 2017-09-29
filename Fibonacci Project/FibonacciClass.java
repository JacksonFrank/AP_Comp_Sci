import java.util.Scanner;

public class FibonacciClass {

	public static void main(String[] args) {
		
		int numbOfNumb;
		Scanner reader = new Scanner(System.in);
		System.out.print("Number of numbers in sequence: ");
		numbOfNumb = reader.nextInt();
		for(int counter = 0; counter < numbOfNumb; counter++) {
			System.out.println(fibonacci(counter));
		}
	}
	
	public static int fibonacci(int sequence) {
		if(sequence == 0) {
			return 0;
		}
		else if(sequence == 1) {
			return 1;
		}
		else {
			return fibonacci(sequence - 1) + fibonacci(sequence - 2);
		}
	}

}
