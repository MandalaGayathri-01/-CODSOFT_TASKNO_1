//
//TASK 1
//NUMBER GAME
//1. Generate a random number within a specified range, such as 1 to 100.
//2. Prompt the user to enter their guess for the generated number.
//3. Compare the user's guess with the generated number and provide feedback on whether the guess
//is correct, too high, or too low.
//4. Repeat steps 2 and 3 until the user guesses the correct number.
//You can incorporate additional details as follows:
//5. Limit the number of attempts the user has to guess the number.
//6. Add the option for multiple rounds, allowing the user to play again.
//7. Display the user's score, which can be based on the number of attempts taken or rounds won

package codsoft;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// Create Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Create Random object to generate a random number
		Random random = new Random();

		// Generate a random number between 1 and 100
		int num = random.nextInt(100) + 1;

		int attempts = 5;// fixed attempt size

		boolean won = false;// to check whether the user has won or not

		int score = 0;// initializing the score

		System.out.println("=========================");
		System.out.println("TASK 1_NUMBER GAME");
		System.out.println("=========================");

		System.out.println("You have to select a random number between 1 and 100 !!");
		System.out.println("You have just 5 attempts to guess it...");
		System.out.println();

		// Repeat the process for 5 attempts
		for (int i = 1; i <= attempts; i++) {
			System.out.println("Attempt " + i + "- Enter your first guess: ");
			int guess = sc.nextInt();

			// check whether the user's guess is correct
			if (guess == num) {
				won = true;
				score = 120 - (i * 20);

				System.out.println();

				System.out.println("Congratulations!! You won the match !!");
				System.out.println("You guessed the right one !! ");
				System.out.println("Correct number is: " + num);
				System.out.println("Attempts used: " + i);
				System.out.println("Your Score : " + score);
				break;// stop the loop
			} else if (guess > num) {// check whether the guess is greater than the random number
				System.out.println("Too HIGH !! ");
			} else {// then guess must be lower
				System.out.println("Too LOW !! ");
			}

			System.out.println("Attempts Remaining : " + (attempts - i));
			System.out.println();
		}

		// If the user didn't guess the number wthin the 5 attempts
		if (!won) {
			System.out.println("=========================");
			System.out.println("You Lost The Match !!");
			System.out.println("Better Luck Next Time !!! ");
			System.out.println("=========================");
			System.out.println("You had used all 5 attempts !! ");
			System.out.println("Correct Number was : " + num);
			System.out.println("Your score : 0 ");
		}

		sc.close();// closing the scanner object

	}

}
