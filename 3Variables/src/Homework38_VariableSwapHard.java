/**
 * Chapter 3 Homework 8
 * 
 * @author Avy
 */
public class Homework38_VariableSwapHard {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 17;
		num1 = num1 + num2; // 25
		num2 = num1 - num2; // 8
		num1 = num1 - num2; // 17 
		System.out.println(num1);
		System.out.println(num2);
	}
}