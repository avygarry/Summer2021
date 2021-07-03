import java.util.Scanner;

public class Break {
	
	public static String readUserStringInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
		public static void main(String[] args) {
			do {
				String letter = readUserStringInput("Enter a letter: ");
				if (letter.equalsIgnoreCase("A")) {
					System.out.println(letter);
					break;
				} else {
					System.out.println("Do you want to try again");
				}
				System.out.println("Continue processing");
			}while (true);
		}	
}
