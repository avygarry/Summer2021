import java.util.Scanner;
/**
 * Chapter 5 Homework 3
 * This program will convert fahrenheit to Celsius or vice versa
 * @author Avy
 */
public class Homework53_TempConversion {
	public static String readUserStringInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
	public static int readUserIntInput(String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	public static void main(String[] args) {
		System.out.println("To get fahrenheit to celsius, enter FC");
		System.out.println("To get celsius to fahrenheit, enter CF");
		String CFFC = readUserStringInput("Enter one option : ");
		
		if (CFFC.equals("FC")) {
			int FF = readUserIntInput("Enter the temperature in Fahrenheit: ");
			int CC = (FF - 32) * 5/9;
			System.out.println(FF + " F = " + CC + " C");
		}else {
			int C = readUserIntInput("Enter the temperature in Celsius: ");
			int F = C/5 * 9 + 32;
			System.out.println(C + " C = " + F + " F");
		}
	}
}
