/**
 * Chapter 7 Homework 4
 * This program will print a specific pattern for the entered character.
 * @author Avy
 */
public class Homework74_PrintFormat {
	
public static void main(String[] args) {
	String charecter = ReadUserInput.readUserStringInput("Enter a charecter: ");
	
	System.out.println(charecter + "    ");
	System.out.println(charecter + charecter + "   ");
	System.out.println(charecter + charecter + charecter + "  ");
	System.out.println(charecter + charecter + charecter + charecter + " ");
	System.out.println(charecter + charecter + charecter + charecter + charecter);
	}
}