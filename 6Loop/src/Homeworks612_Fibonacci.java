/**
 * Chapter 6 Homework 12 This program will print 10 Fibonacci numbers
 * 
 * @author Avy
 */
public class Homeworks612_Fibonacci {
	public static void main(String[] args) {
		int num = ReadUserInput.readUserIntInput("Enter how many numbers you want to print: ");
		int s1 = 0;
		int s2 = 1;
		int timesPrinted = 0;
		do {
		System.out.println(s1);
		System.out.println(s2);
			s1 = s1 + s2;
			s2 = s2 + s1;
			timesPrinted++;
			timesPrinted++;
			} while (timesPrinted < num);
		}
	}