import java.util.Scanner;
/**
 * Chapter 7 Homework 4
 * For
 * @author Avy
 */
public class Homework74_PrintFormat {
	public static String readUserStringInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
		
	}
public static void main(String[] args) {
	String charecter = ReadUserInput.readUserStringInput("Enter a charecter: ");
	
	System.out.println(charecter + "    ");
	System.out.println(charecter + charecter + "   ");
	System.out.println(charecter + charecter + charecter + "  ");
	System.out.println(charecter + charecter + charecter + charecter + " ");
	System.out.println(charecter + charecter + charecter + charecter + charecter);
	}
}