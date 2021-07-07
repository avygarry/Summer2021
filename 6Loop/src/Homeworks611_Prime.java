/**
 * Chapter 6 Homework 11
 * This program will tell you if your number is prime or not
 * @author Avy
 */
public class Homeworks611_Prime {
public static void main(String[] args) {
	int num = ReadUserInput.readUserIntInput("Enter a number: ");
	int NP = 1;
	
	for (int x = 1; x < num; x++) {
		if (num % x != 0) {
			NP = 1;
		}
		if (num % x == 0) {
			NP = 2;
		} 
	}
	if (NP == 1) {
		System.out.println("The entered number is prime.");
	} else {
		System.out.println("The entered number is not prime.");
	}
}
}
