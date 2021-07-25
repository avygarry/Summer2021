/**
 * Chapter 6 Homework 11
 * This program will tell you if your number is prime or not
 * @author Avy
 */
public class Homeworks611_Prime {
public static void main(String[] args) {
	int num = ReadUserInput.readUserIntInput("Enter a number: ");
	
	for (int x = 2; x < num; x++) {
		if (num % x == 0) {
			System.out.println(num + " is composite");
			break;
		} else {
			System.out.println(num + " is prime");
			break;
		}
	}

}
}
