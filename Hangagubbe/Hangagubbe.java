package Hangagubbe;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangagubbe {

	private static Scanner _input = new Scanner(System.in);
	private static ArrayList<String> _wordlist = new ArrayList<String>();
	private static ArrayList<String> _wrongGuesses = new ArrayList<String>();
	private static String _progressWord = "";

	public static void main(String[] args) {
		printWelcomeMessage();
		play();
		printGoodbyeMessage();
	
	}

	/**
	 * En starmeny och en replay funktion
	 */
	private static void play() {
		while (true) {
			System.out.println("Välj svårighetsgrad:");
			System.out.println("\t1. Lätt");
			System.out.println("\t2. Medium");
			System.out.println("\t3. Svår");
			int difficulty = getValidIntegerInput();
			if (difficulty >= 1 && difficulty <= 3) {
				ord.startGame(difficulty);

				System.out.println("Do you want to play again) y/Y for yes, anything else means no");
				String playAgain = _input.nextLine();
				if (!(playAgain.toLowerCase().equals("y"))) {
					break;
				}
			}
		}
	}

	private static void printGoodbyeMessage() {
		System.out.println("Stick!!!");
	}

	private static void printWelcomeMessage() {
		System.out.println("\r\n" + "                                                \r\n"
				+ " _____ 0 0                _____     _   _       \r\n"
				+ "|  |  |___ ___ ___ ___   |   __|_ _| |_| |_ ___ \r\n"
				+ "|     | .'|   | . | .'|  |  |  | | | . | . | -_|\r\n"
				+ "|__|__|__,|_|_|_  |__,|  |_____|___|___|___|___|\r\n"
				+ "              |___|                             \r\n" + "\r\n" + "Välkommen till Hänga Gubbe!\r\n"
				+ "Det här spelet går ut på att gissa bokstäverna på ett okänt ord, innan nån random person blir avrättad\r\n"
				+ "Kom ihåg, om du misslyckas, så är du delvis ansvarig för deras död!\r\n");
	}

	/**
	 * Tar och gör så man måste skriva in rätt inputtyp som är ett nummer.
	 */
	private static int getValidIntegerInput() {
		while (true) {
			if (!_input.hasNextInt()) {
				_input.nextLine();
				System.out.println("Input a number");
				continue;
			}

			int returnValue = _input.nextInt();
			_input.nextLine();
			return returnValue;
		}
	}

	/**
	 * Tar in easy-, normal- eller hardgame beroende på vilken difficulty som man
	 * skriver i konsollen
	 */
//	private static void startGame(int difficulty) {
//		switch (difficulty) {
//		case 1:
//			easyGame();
//			break;
//		case 2:
//			normalGame();
//			break;
//		case 3:
//			hardGame();
//			break;
//		}
//	}
//
//	private static void easyGame() {
//		populateEasyWordList();
//		gameCore();
//	}
//
//	private static void populateEasyWordList() {
//		_wordlist.clear();
//		_wordlist.add("ko");
//		_wordlist.add("katt");
//		_wordlist.add("fisk");
//		_wordlist.add("Snigel");
//
//	}
//
//	private static void normalGame() {
//		populateNormalWordList();
//		gameCore();
//	}
//
//	private static void populateNormalWordList() {
//		_wordlist.clear();
//		_wordlist.add("Yxa");
//		_wordlist.add("kraft");
//		_wordlist.add("Saxen");
//		_wordlist.add("Zebra");
//
//	}
//
//	private static void hardGame() {
//		populateHardWordList();
//		gameCore();
//	}
//
//	private static void populateHardWordList() {
//		_wordlist.clear();
//		_wordlist.add("Ukulele");
//		_wordlist.add("Mustasch");
//		_wordlist.add("Fönsterputsare");
//		_wordlist.add("Schnitzel");
//		_wordlist.add("klamydia");
//	}

	/**
	 * Tar och kollar igenom guess först ifall det är hela ordet, sedan ifall det
	 * inte är en gissning för hela ordet kollar den ifall det är en gissning för en
	 * bokstav.
	 */
	static void gameCore() {
		_wrongGuesses.clear();
		String answer = getRandomWord();
		initProgressWord(answer);
		System.out.println(_progressWord);
		for (int tries = 0; tries < 8; tries++) {
			System.out.println("Gissa");
			String guess = _input.nextLine();

			if (guess.toLowerCase().equals(answer.toLowerCase())) {
				System.out.println("Grattis");
				break;
			}

			if (guess.length() > 1) {
				System.out.println("Wrong word or input length");
				continue;
			} else if (guess.length() == 0) {
				System.out.println("Poo poo brain");
				tries--;
				continue;
			}

			char guessChar = guess.toLowerCase().charAt(0);

			if (answer.toLowerCase().contains(guess)) {
				printStatus(true, answer, guessChar, tries);
				if (answer.toLowerCase().equals(_progressWord.toLowerCase())) {
					System.out.println("Grattis");
					break;
				}
				tries--;
				continue;
			}
			_wrongGuesses.add(guess);
			printStatus(false, answer, guessChar, tries);

		}
	}

	/**
	 * Tar och gör ordet som är slumpmässigt valt gömt. ex Stol till ----
	 */
	private static void initProgressWord(String answer) {
		_progressWord = "";

		for (int i = 0; i < answer.length(); i++) {
			_progressWord += "-";
		}
	}

	/**
	 * Tar och byter ut den gömda "-" med gissningen ifall det är rätt gissning
	 */
	private static void printStatus(boolean correct, String answer, char guessChar, int tries) {
		if (correct) {
			// byt ut - i _progressWord där gissningen skall vara. ex --- = kul | guess ==

			char[] progressArray = _progressWord.toCharArray();

			for (int i = 0; i < answer.length(); i++) {
				if (answer.toLowerCase().charAt(i) == guessChar) {
					progressArray[i] = guessChar;
				}

			}
			_progressWord = String.copyValueOf(progressArray);

			System.out.println(_progressWord);
			System.out.println(_wrongGuesses.toString());
			System.out.println((7 - tries) + " Försök kvar");
			hangmanImg(tries);
			// Måla gubben, skriv ut antal liv kvar
		} else {
			System.out.println(_progressWord);
			System.out.println(_wrongGuesses.toString());
			System.out.println((7 - tries) + " Försök kvar");
			hangmanImg(tries);
			// Måla gubben, skriv ut antal liv kvar
		}
	}

	/**
	 * Tar och väljer ett ord slumpmässigt
	 */
	private static String getRandomWord() {
		int randomIndex = (int) (Math.random() * _wordlist.size());
		String randomWord = _wordlist.get(randomIndex);
		return randomWord;
	}

	/**
	 * En metod med Hangman som skrivs upp
	 */
	private static void hangmanImg(int tries) {
		if (tries == 1) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");

		}
		if (tries == 2) {
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (tries == 3) {
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (tries == 4) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (tries == 5) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (tries == 6) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (tries == 7) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
	}
}