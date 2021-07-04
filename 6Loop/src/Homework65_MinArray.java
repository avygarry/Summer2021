import java.util.Scanner;

/**
 * 
 * @author Avy
 *
 */
public class Homework65_MinArray {
	
	public static void main(String[] args) {
		int []numbers;
		numbers = new int [4];
		numbers[0] = ReadUserIntInput.readUserIntInput("Enter a number: ");
		numbers[1] = ReadUserIntInput.readUserIntInput("Enter a number: ");
		numbers[2] = ReadUserIntInput.readUserIntInput("Enter a number: ");
		numbers[3] = ReadUserIntInput.readUserIntInput("Enter a number: ");
		
		int min = numbers[0];
		for ( int number : numbers) {
			if (min > number) {
				min = number;
			}
		}
		System.out.println("The lowest number is " + min);
		
	}
	
	

}
