/**
 * Chapter 6 Homework 11
 * This program will tell you if your number is prime or not
 * @author Avy
 */
public class Homeworks611_Prime {
public static void main(String[] args) {
	int num = ReadUserInput.readUserIntInput("Enter a number: ");
	String NP = "a";
	
	for (int x = 1; x < num; x++) {
		if (num % x == 0) {
			NP ="Prime";
		}else {
//		 (num % x != 0) {
			NP = "Composite";
		} 
	}
	if (NP.equalsIgnoreCase("Prime")) {
		System.out.println("The entered number is prime.");
	} else {// if (NP.equalsIgnoreCase("Composite")) {
		System.out.println("The entered number is Composite.");
	}
}
}
