import java.util.Scanner;

/**
 * Chapter 4 Homework 4
 * This program can tell you what grades you got
 * @author Avy
 */
public class Homework44_GradesCalculator {

	public static int readUserIntInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		int math = readUserIntInput("Enter your grade for Math: ");
		int english = readUserIntInput("Enter your grade for English: ");
		int language = readUserIntInput("Enter your grade for the Language you take: ");
		int science = readUserIntInput("Enter your grade for Science: ");
		
	}
}
