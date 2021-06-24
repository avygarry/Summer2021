/**
 * Chapter 3 Homework 5
 * This program will add 1 or subtract on the the values given. It'll also print the opposite boolean value
 * @author Avy
 */
public class Homework35_UnaryOperations {
	public static void main(String[] args) {
		int num1 = 21;
		int nuM1 = num1;
		int finalNum1 = ++num1;
		int num2 = -16;
		int nuM2 = num2;
		int finalNum2 = --num2;
		boolean tf = false;
		boolean finalTf = !tf;
		System.out.println(nuM1 + " + 1 = " + finalNum1);
		System.out.println(nuM2 + " - 1 = " + finalNum2);
		System.out.println("The opposite of " + tf + " is " + finalTf);
		
	}
}
