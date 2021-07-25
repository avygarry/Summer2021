
public class Homework76_LetterCount {
	public static void main(String[] args) {
		String sentence = ReadUserInput.readUserStringInput("Enter a sentence: ");
		int letterCount = 0;
		char[] chars = sentence.toCharArray();
		for (char charecter : chars) {
			if (charecter != ' ') {
				letterCount++;
			}
		}
		System.out.println("Letter Count: " + letterCount);
	}
}
