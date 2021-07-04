/**
 * Chapter 6 Homework 9
 * This program will ask the user for their driver's license and age to see if they can drive.
 * @author Avy
 */
public class Homework69_Driving {

	public static void main(String[] args) {
		String license = ReadUserInput.readUserStringInput("Enter whether you have a Drivers License: ");
		int age = ReadUserInput.readUserIntInput("Enter whether you have a Drivers License: ");
		
		if (license.equalsIgnoreCase("Yes") && age > 18) {
			System.out.println("You are allowed to drive.");
		}else {
			System.out.println("You aren't allowed to drive.");
		}
		
	}

}
