package marco.topics;

import java.util.Stack;

public class StringReformat {
	String string;
	String formated;

	public StringReformat(String input, int maxNumber) {
		string = input;
		formatString(maxNumber);
	}

	public void formatString(int maxNumber) {
		int counter = 0;
		String resultString = "";
		// Stack<Character> charStack = new Stack<Character>();
		string = string.replaceAll("-", "");

		int remainder = string.length() % maxNumber;
		boolean shorterFlag = false;
		if (remainder != 0) {
			shorterFlag = true;
		}
		System.out.println(string+shorterFlag);
		for (int i = 0; i < string.length(); i++) {
			counter++;
			if (shorterFlag && (counter == remainder)) {
				resultString += '-';
				shorterFlag = false;
				counter = 0;
			}

			resultString += string.charAt(i);
			if (counter == maxNumber && (i != string.length()-1)) {
				resultString += '-';
				counter = 0;
			}


		}
		
		formated = resultString;

	}

	public String toString() {
		return formated;
	}
}
