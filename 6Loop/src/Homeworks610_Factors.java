/**
 * Chapter 6 Homework 10
 * This program will tell u the factors for the number the user tells
 * @author Avy
 */
public class Homeworks610_Factors {
	public static void main(String[] args) {
		int num = ReadUserInput.readUserIntInput("Enter a number: ");
		
		System.out.print("Factors for " + num + ": ");
		for (int x = 1; x < num; x++) {
			if (num % x == 0) {
				System.out.print(x + ", ");
			}
		}
		System.out.print(num);
	}

}
