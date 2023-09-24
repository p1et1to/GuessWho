import java.util.Scanner;

public class GuessingGameGit {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int numberOfGuesses = 0 ; //Muuttuja arvausten määrälle laskuria varten, pelin alussa 0.
		boolean gameIsRunning;
		
		do		{  	//Aloitetaan looppi.
		System.out.println("What's my name? Write END if you want to leave the game.");
		String name = in.nextLine(); //Käyttäjän input tallennetaan muuttujaan "name".
		
				if (name.equals("Danielle")) { //Määritellään oikea vastaus.
					numberOfGuesses++; //Sisällytetään oikean nimen arvaus laskuriin.
					System.out.println("Congrats, that's correct! You got it right in " + numberOfGuesses + " tries!");
					gameIsRunning = false; //Käyttäjä arvaa oikein, ohjelma päättyy.
					 
				}
		
				else if (name.equals("END")) { 
					System.out.println("You quit.\n" + "You tried " + numberOfGuesses + " times.");
					gameIsRunning = false; //Käyttäjä lopettaa ohjelman. Yritysten määrä tulostetaan. ENDin kirjoittamista ei lasketa yritykseksi.
					
				}
		
				else {	//Jos käyttäjä ei kirjoita oikeaa vastausta tai lopeta ohjelmaa, looppi jatkaa pyörimistään.
	
					System.out.println("Wrong! Try again.");
					gameIsRunning = true; //Peli jatkaa pyörimistään.
					numberOfGuesses++; //Lasketaan arvauskertoja, jos arvaus menee väärin.
				}
		} while (gameIsRunning);
	}
}