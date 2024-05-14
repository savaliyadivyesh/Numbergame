import java.util.Scanner;
import java.util.Random;



public class Randomnumber {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		Random random = new Random();

		int targetnumber = random.nextInt(100) + 1;
		int guess;
		int attempts = 0;

		System.out.println("this number is a random number");
		System.out.println("i have selected 1 to 100");

		while (true) {
			System.out.println("enter your guess");
			guess = Scanner.nextInt();
			attempts++;

			if (guess == targetnumber) {
				System.out.println("correct, You Take "  + attempts + " attempts");
				break;
			}else if(guess<targetnumber) {
				System.out.println("too low");
			}else {
				System.out.println("too high");
			}

		}

	}

}
