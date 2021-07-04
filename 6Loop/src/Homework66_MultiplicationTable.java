/**
 * Chapter 6 Homework 6
 * This will print the multiplication table of the entered number
 * @author Avy
 */
public class Homework66_MultiplicationTable {
	
	public static void main(String[] args) {
		float num = ReadUserInput.readUserFloatInput("Enter a number: ");
		
		for (float x = 1; x<11; x++) {
			float multiply = num*x;
			System.out.println(num + " x " + x + " = " + multiply);
		}
		
	}

}
