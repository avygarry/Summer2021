/**
 * Chapter 7 Homework 5
 * This program will tell you how many words are in the sentence.
 * @author Avy
 */
public class Homework75_SpaceCount {
	public static void main(String[] args) {
		String sentence = ReadUserInput.readUserStringInput("Enter a sentence: ");
		int wordCount = 0;
		char lastChar = 'a';
		char[] chars = sentence.toCharArray();
		for (char charecter : chars) {
			if (charecter == ' ' && lastChar != ' ') {
				wordCount++;
			}
			lastChar = charecter;
		}
		wordCount++;
		System.out.println("Word count: " + wordCount);
	}
}
