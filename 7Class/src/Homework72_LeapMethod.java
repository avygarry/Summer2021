/**
 * Chapter 7 Homework 2
 * This tells whether the century is a leap or not
 * @author Avy
 */
public class Homework72_LeapMethod {
	public static void main(String[] args) {
		int year = ReadUserInput.readUserIntInput("Enter a year: ");
	}

	public static int leap(year); {
		if (year % 100 == 0 && year % 400 != 0) {
			return "Not leap year";
		}
		
	}
		
	
}
