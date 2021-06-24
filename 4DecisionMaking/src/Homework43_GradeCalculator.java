import java.util.Scanner;

public class Homework43_GradeCalculator {
	
	public static int readUserIntInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	public static void main(String[] args) {
		int grade = readUserIntInput("Enter your grade: ");
		if (grade > 100) {
			System.out.println("You idiot. Thats not possible, so you probably got a 0 that your trying to hide, but you failed");
		}
		if (grade > 90) {
			System.out.println("You have an A+");
		}
		if (grade > 79) {
			if (grade < 91) {
				System.out.println("You have an A");
			}
		}
		if (grade > 69) {
			if (grade < 81) {
				System.out.println("You have an B+");
			}
		}
		if (grade > 59) {
			if (grade < 71) {
				System.out.println("You have an B");
			}
		}
		if (grade > 49) {
			if (grade < 61) {
				System.out.println("You have an C");
			}
		}
		if (grade < 50) {
			System.out.println("You have an F");
		}
		
	}

	
	
	
	
	
	
	
	
}
