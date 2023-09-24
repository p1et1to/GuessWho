import java.util.Scanner;

public class GuessingGameGit {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int numberOfGuesses = 0 ; 
		boolean gameIsRunning;
		
		do		{  
		System.out.println("What's my name? Write END if you want to leave the game.");
		String name = in.nextLine(); 
		
				if (name.equals("Danielle")) { 
					numberOfGuesses++; 
					System.out.println("Congrats, that's correct! You got it right in " + numberOfGuesses + " tries!");
					gameIsRunning = false; 
					 
				}
		
				else if (name.equals("END")) { 
					System.out.println("You quit.\n" + "You tried " + numberOfGuesses + " times.");
					gameIsRunning = false;
					
				}
		
				else {
	
					System.out.println("Wrong! Try again.");
					gameIsRunning = true;
					numberOfGuesses++; 
				}
		} while (gameIsRunning);
	}
}