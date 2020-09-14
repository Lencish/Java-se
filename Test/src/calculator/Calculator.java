package calculator;

public class Calculator {
	
	



	/**
	 * Function which add doubles
	 */
	public String addNumbers(double... a) {
		double result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return "" + result;
	}

	/**
	 * Function which substract doubles
	 */
	public String substractNumbers(double... a) {
		double result = a[0];
		for (int i = 1; i < a.length; i++) {
			result -= a[i];
		}
		return "" + result;
	}

	/**
	 * Function which multiply doubles
	 */
	public String multiplyNumbers(double... a) {
		double result = 1;
		for (int i = 0; i < a.length; i++) {
			result *= a[i];
		}
		if (result == -0.0)
			return "" + 0.0;
		return "" + result;
	}

	/**
	 * Function which divide two doubles
	 *
	 * a = first number b = second number
	 */
	public String divideNumbers(double a, double b) {
		if (b != 0)
			return (double) a / b + "";
		else
			return "You cannot divide by ZERO!";
	}

	/**
	 * sqrt number
	 */
	public String sqrt(double number, double rank) {

		double result = number;
		double tmp = Math.pow(result, (rank - 1));
		double e = 0.00000001;

		while (Math.abs(number - tmp * result) >= e) {
			result = (1 / rank) * ((rank - 1) * result + (number / tmp));

			tmp = Math.pow(result, rank - 1);
		}
		if (number < 0 && rank % 2 != 0)
			return "" + (0 - result);
		else
			return "" + result;
	}

	/**
	 * Power a number
	 */
	public String power(double number, double pow) {
		return Math.pow(number, pow) + "";
	}

	/**
	 * convert number to decimal system
	 */
	public String convertToBinary(int number, int base) {
		final int MAXIMUM_BASE = 36;
		final String patternText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result = "";

		if (base > MAXIMUM_BASE || base < 2)
			return "Wrong data";
		else if (number == 0)
			return 0 + "";
		else {
			do {
				result = patternText.charAt(number % base) + result;
				number = number / base;
			} while (number > 0);

			return "0" + result;
		}
	}

	/**
	 * Method for convertDecimalToNumber() method
	 */
	private static int valueOf(char x, int base) {
		final String patternText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < base; i++) {
			if (x == patternText.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * convert binary system to decimal
	 */
	public String convertBinaryToDecimal(String str, int base) {
		final int MAXIMUM_BASE = 36;
		final String patternText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int value;
		int rank = 1;
		int result = 0;
		str = str.toUpperCase();

		if (base > MAXIMUM_BASE || base < 2)
			return 0 + "";

		for (int i = str.length() - 1; i >= 0; i--) {
			value = valueOf(str.charAt(i), base);
			if (value < 0) {
				return 0 + "";
			} else {
				result = result + (value * rank);
				rank = rank * base;
			}
		}
		return result + "";
	}

	/**
	 * calculate a median number
	 */
	public String median(double... a) {
		double value;
		if (a.length % 2 == 0) {
			return a[a.length / 2 - 1] + ", " + a[a.length / 2];
		} else {
			value = a[a.length / 2];
			return value + "";
		}
	}

	/**
	 * calculate average of numbers
	 */
	public String calculateAverage(double... a) {
		double result = 0;
		double average = 0;

		for (int i = 0; i < a.length; i++) {
			result = result + a[i];
			average = result / a.length;
		}
		return average + "";
	}

}
