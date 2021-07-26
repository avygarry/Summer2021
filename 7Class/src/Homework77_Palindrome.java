
public class Homework77_Palindrome {
	public static void main(String[] args) {
		String word = ReadUserInput.readUserStringInput("Enter a word: ");
		char[] chars = word.toCharArray();
		char lastChar = 'a';
		boolean palindrome = true;
		int length = chars.length - 1;
		for (int i = 0; i < chars.length - 1; i++) {
			lastChar = chars[length];
			length--;
			if (chars[i] != lastChar) {
				System.out.println(word + " is not a Palindrome.");
				palindrome = false;
				break;
			}
		}
		if (palindrome == true) {
			System.out.println(word + " is a Palindrome.");
		}
	}

}
