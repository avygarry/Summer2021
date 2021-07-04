/**
 * Chapter 6 Homework 5
 * This program asks the user for 4 numbers and then will tell which is the lowest
 * @author Avy
 */
public class Homework65_MinArray {
	
	public static void main(String[] args) {
		int []numbers;
		numbers = new int [5];
		
		for (int x = 0; x < numbers.length; x++) {
			numbers[x] = ReadUserInput.readUserIntInput("Enter the number " + (x+1) +": ");
		}
		
		
		int min = numbers[0];
		for ( int number : numbers) {
			if (min > number) {
				min = number;
			}
		}
		System.out.println("The lowest number is " + min);
		
	}
	
	

}
