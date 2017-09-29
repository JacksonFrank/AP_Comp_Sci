import java.util.*;
public class Mastermind {

	static boolean debug = true;
	public static void main(String[] args) {
		System.out.println("Mastermind!");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		
		Random rand = new Random();
		int answer[] = new int[4];
		for(int i = 0; i < 4; i++){
			answer[i] = rand.nextInt(10);
		}
		if(debug){
			for(int i = 0; i < 4; i++){
				System.out.print(answer[i]);
			}
		}
		System.out.println();
		Boolean cont = true;
		while (cont){
			int guess[] = new int[4];
			System.out.println("Input your four digit number here.");
			System.out.print("Please delimit each digit by a space: ");
			for(int g = 0; g < 4; g++){
				guess[g] = console.nextInt();
			}
			cont = checkDigits(answer, guess);
			
			System.out.println();
			System.out.println();
			
		}
		System.out.print("You Win!");
		
		
		console.close();

	}
	public static Boolean checkDigits(int _answer[], int _guess[]){
		int cR = 0;
		int cW = 0;
		boolean matching[] = {false, false, false, false};
		
		for(int i = 0; i < 4; i++){
			if(_guess[i] == _answer[i]){
				cR ++;
				matching[i] = true;
			}
		}
		
		for(int i = 0; i < 4; i++){
			for(int g = 0; g < 4; g++){
				if(_guess[i] == _answer[g] && i != g && matching[i] == false){
					cW ++;
					break;
				}
			}
		}
		
		System.out.println("Correct digits: " + cR);
		System.out.println("Correct digits in the wrong place: " + cW);
		if(cR < 4){
			return true;
		}
		else{
			return false;
		}
	}

}
