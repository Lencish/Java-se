package Hangagubbe;

import java.util.ArrayList;

public class ord {
	static ArrayList<String> _wordlist = new ArrayList<String>();
	static ArrayList<String> orden = new ArrayList<String>();

	static void startGame(int difficulty) {
		switch (difficulty) {
		case 1:
			easyGame();
			break;
		case 2:
			normalGame();
			break;
		case 3:
			hardGame();
			break;
		}
	}

	private static void easyGame() {
		populateEasyWordList();
		Hangagubbe.gameCore();
	}

	private static void populateEasyWordList() {
		_wordlist.clear();
		_wordlist.add("ko");
		_wordlist.add("katt");
		_wordlist.add("fisk");
		_wordlist.add("Snigel");

	}

	private static void normalGame() {
		populateNormalWordList();
		Hangagubbe.gameCore();
	}

	private static void populateNormalWordList() {
		_wordlist.clear();
		_wordlist.add("Yxa");
		_wordlist.add("kraft");
		_wordlist.add("Saxen");
		_wordlist.add("Zebra");

	}

	private static void hardGame() {
		populateHardWordList();
		Hangagubbe.gameCore();
	}

	private static void populateHardWordList() {
		_wordlist.clear();
		_wordlist.add("Ukulele");
		_wordlist.add("Mustasch");
		_wordlist.add("Fönsterputsare");
		_wordlist.add("Schnitzel");
		_wordlist.add("klamydia");

	}

}
