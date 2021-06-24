import java.util.Scanner;

/**
 * Chapter 4 Homework 1
 * This program will tell you if the entered number is greater than 100, if its even or odd, and the greatest and least number out of 4
 * @author Avy
 */
public class Homework41_EvenOddMaxMin {
	
	public static int readUserIntInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
//Asks for a number and replies telling you whether if its greater than 100
	public static void main(String[] args) {
		int num1G = readUserIntInput("Enter a number: ");
		if (num1G > 100) {
			System.out.println(num1G + " is greater than 100.");
		}
//Asks for a number and replies telling you whether the number is odd or even
		int num1EO = readUserIntInput("Enter a number: ");
		if (num1EO % 2 == 1) {
			System.out.println(num1EO + " is odd");
		}else{
			System.out.println(num1EO + " is even");
		}
//determines the greatest number out of 4
		int num1Mx = readUserIntInput("Enter a number: ");
		int num2Mx = readUserIntInput("Enter a number: ");
		int num3Mx = readUserIntInput("Enter a number: ");
		int num4Mx = readUserIntInput("Enter a number: ");
		if (num1Mx > num2Mx) {
			if (num1Mx > num3Mx) {
				if (num1Mx > num4Mx) {
					System.out.println(num1Mx + " is the greatest number.");
				}
			}
		}
		if (num2Mx > num1Mx) {
			if (num2Mx > num3Mx) {
				if (num2Mx > num4Mx) {
					System.out.println(num2Mx + " is the greatest number.");
				}
			}
		}
		if (num3Mx > num2Mx) {
			if (num3Mx > num1Mx) {
				if (num3Mx > num4Mx) {
					System.out.println(num3Mx + " is the greatest number.");
				}
			}
		}
		if (num4Mx > num2Mx) {
			if (num4Mx > num3Mx) {
				if (num4Mx > num1Mx) {
					System.out.println(num4Mx + " is the greatest number.");
				}
			}
		}
//determines the lowest number out of 4
		int num1Mn = readUserIntInput("Enter a number: ");
		int num2Mn = readUserIntInput("Enter a number: ");
		int num3Mn = readUserIntInput("Enter a number: ");
		int num4Mn = readUserIntInput("Enter a number: ");
		if (num1Mn < num2Mn) {
			if (num1Mn < num3Mn) {
				if (num1Mn < num4Mn) {
					System.out.println(num1Mn + " is the lowest number.");
				}
			}
		}
		if (num2Mn < num1Mn) {
			if (num2Mn < num3Mn) {
				if (num2Mn < num4Mn) {
					System.out.println(num2Mn + " is the lowest number.");
				}
			}
		}
		if (num3Mn < num2Mn) {
			if (num3Mn < num1Mn) {
				if (num3Mn < num4Mn) {
					System.out.println(num3Mn + " is the lowest number.");
				}
			}
		}
		if (num4Mn < num2Mn) {
			if (num4Mn < num3Mn) {
				if (num4Mn < num1Mn) {
					System.out.println(num4Mn + " is the lowest number.");
				}
			}
		}
	}
		
}


