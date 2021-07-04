/**
 * Chapter 6 Homework 4
 * This program will print they highest number out of 4
 * @author Avy
 */
public class Homework64_MaxArray {
	public static void main(String[] args) {
		int []numbers;
		numbers = new int [10];
		numbers[0] = 5;
		numbers[1] = 27;
		numbers[2] = 6;
		numbers[3] = 49;
		numbers[4] = 92;
		numbers[5] = 91;
		numbers[6] = 7;
		numbers[7] = 42;
		numbers[8] = 65;
		numbers[9] = 18;
		int max = numbers[0];
		 for (int number: numbers) {
			 if (max < number) {
				 max = number;
			 }
		 }
		System.out.println("The greatest number is " + max);
	}
}
