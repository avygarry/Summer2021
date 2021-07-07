import java.util.Scanner;

public class Homework74_PrintFormat {
	public static String readUserStringInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
		
	}
public static void main(String[] args) {
	char charecter = readUserInput("Enter a charecter");
	
	System.out.println(charecter + "    ");
	System.out.println(charecter + charecter + "   ");
	System.out.println(charecter + charecter + charecter + "  ");
	System.out.println(charecter + charecter + charecter + charecter + " ");
	System.out.println(charecter + charecter + charecter + charecter + charecter);
}
}