package hangMan;

public class Private {
	

		private static String[] Words = { "klamydia", "herpes", "HIV", "gonorre", "Aids", "hepatit" };
		static String word = Words[(int) (Math.random() * Words.length)];

		public static String getWord() {
			return word;
		}

		public static void setWords(String[] words) {
			Words = words;
		}

	}

