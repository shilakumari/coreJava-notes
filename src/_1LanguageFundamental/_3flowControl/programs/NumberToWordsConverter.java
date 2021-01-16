package _1LanguageFundamental._3flowControl.programs;

public class NumberToWordsConverter {
	long number;

	public NumberToWordsConverter(long number) {
		super();
		this.number = number;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long leftChars(long number, int n) {
		String strNumber = new Long(number).toString();// number+""
		String leftStrNumber = leftChars(strNumber, n);
		// return Long.parseLong(leftStrNumber);
		return new Long(leftStrNumber).longValue();
	}

	private String leftChars(String strNumber, int n) {
		if (strNumber.length() <= n) {
			return strNumber;
		} else {
			return strNumber.substring(0, n);
		}
	}

	public long rightChars(long number, int n) {
		String strNumber = new Long(number).toString();// number+""
		String leftStrNumber = rightChars(strNumber, n);
		// return Long.parseLong(leftStrNumber);
		return new Long(leftStrNumber).longValue();
	}

	private String rightChars(String strNumber, int n) {
		if (strNumber.length() <= n) {
			return strNumber;
		} else {
			return strNumber.substring(strNumber.length() - n);
		}
	}

	private String belowCrore(long number2) {
		if (number2 < 10)
			return belowTen(number2);
		else if (number2 < 20)
			return belowTwenty(number2);
		else if (number2 < 100)
			return belowHundred(number2);
		else if (number2 < 1000)
			return belowThousand(number2);
		else if (number2 < 100000)
			return belowLakh(number2);

		else if (number2 < 1000000) {
			return belowThousand(leftChars(number2, 1)) + "Lakh " + belowLakh(rightChars(number2, 5));
		} else if (number2 < 10000000) {
			return belowThousand(leftChars(number2, 2)) + "Lakh " + belowLakh(rightChars(number2, 5));
		}
		return "";
	}

	private String belowLakh(long number2) {
		if (number2 < 10)
			return belowTen(number2);
		else if (number2 < 20)
			return belowTwenty(number2);
		else if (number2 < 100)
			return belowHundred(number2);
		else if (number2 < 1000)
			return belowThousand(number2);
		else if (number2 < 10000) {
			return belowTen(leftChars(number2, 1)) + "Thousand " + belowThousand(rightChars(number2, 3));
		} else if (number2 < 100000) {
			return belowHundred(leftChars(number2, 2)) + "Thousand " + belowThousand(rightChars(number2, 3));
		}
		return "";
	}

	private String belowThousand(long number2) {
		if (number2 < 10)
			return belowTen(number2);
		else if (number2 < 20)
			return belowTwenty(number2);
		else if (number2 < 100)
			return belowHundred(number2);
		else if (number2 < 1000) {
			return belowTen(leftChars(number2, 1)) + "Hundred " + belowHundred(rightChars(number2, 2));
		}
		return "";
	}

	private String belowHundred(long number2) {
		if (number2 < 10)
			return belowTen(number2);
		else if (number2 < 20)
			return belowTwenty(number2);
		switch ((int) leftChars(number2, 1)) {
		case 2:
			return "Twenty " + belowTen(rightChars(number2, 1));
		case 3:
			return "Thirty " + belowTen(rightChars(number2, 1));
		case 4:
			return "Fourty " + belowTen(rightChars(number2, 1));
		case 5:
			return "Fifty " + belowTen(rightChars(number2, 1));
		case 6:
			return "Sixty " + belowTen(rightChars(number2, 1));
		case 7:
			return "Seventy " + belowTen(rightChars(number2, 1));
		case 8:
			return "Eighty " + belowTen(rightChars(number2, 1));
		case 9:
			return "Ninety " + belowTen(rightChars(number2, 1));
		}
		return "";
	}

	private String belowTwenty(long number2) {
		if (number2 < 10)
			return belowTen(number2);
		switch ((int) number2) {
		case 10:
			return "Ten ";
		case 11:
			return "Eleven ";
		case 12:
			return "Twelve ";
		case 13:
			return "Thirteen ";
		case 14:
			return "Fourteen ";
		case 15:
			return "Fifteen ";
		case 16:
			return "Sixteen ";
		case 17:
			return "Seventeen ";
		case 18:
			return "Eighteen ";
		case 19:
			return "Nineteen";
		}
		return "";
	}

	private String belowTen(long number2) {
		switch ((int) number2) {
		case 1:
			return "One ";
		case 2:
			return "Two ";
		case 3:
			return "Three ";
		case 4:
			return "Four ";
		case 5:
			return "Five ";
		case 6:
			return "Six ";
		case 7:
			return "Seven ";
		case 8:
			return "Eight ";
		case 9:
			return "Nine ";
		}
		return "";
	}

	public String getNumberInWords() {
		if (number < 10) {
			return belowTen(number);
		} else if (number < 20) {
			return belowTwenty(number);
		} else if (number < 100) {
			return belowHundred(number);
		} else if (number < 1000) {
			return belowThousand(number);
		} else if (number < 100000) {
			return belowLakh(number);
		} else if (number < 10000000) {
			return belowCrore(number);
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.print(new NumberToWordsConverter(9999999).getNumberInWords());
	}
}
