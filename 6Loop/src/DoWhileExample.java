import java.util.Scanner;

public class DoWhileExample {
	public static String readUserStringInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
	public static void main(String[] args) {
		boolean ContinueAgain = false;
		do {
		String userInput = readUserStringInput("Enter option: ");
		if (userInput.equalsIgnoreCase("FC")) {
			System.out.println("F to C");
			String Continue = readUserStringInput("Do you wanna continue ");
			if (Continue.equalsIgnoreCase ("y")) {
				ContinueAgain = true;
			}
		} else if (userInput.equalsIgnoreCase("CF")) {
			System.out.println("C to F");
			String Continue = readUserStringInput("Do you wanna continue ");
			if (Continue.equalsIgnoreCase ("y")) {
				ContinueAgain = true;
			}
		} else {
			System.out.println("Invalid input, try again");
			ContinueAgain = true;
		}
	} while (ContinueAgain);
		
		
		
		
	}

}
