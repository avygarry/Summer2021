import java.util.Scanner;

public class ReadUserIntInput {
	public static int readUserIntInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}
