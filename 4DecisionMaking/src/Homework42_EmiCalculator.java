import java.util.Scanner;

/**
 * Chapter 4 Homework 2
 * This program can calculate you EMI
 * @author Avy
 */
public class Homework42_EmiCalculator {
	
	public static float readUserFloatInput(String aFloatMsg) {
		System.out.print( aFloatMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	}
//Asks for all of the information
	public static void main(String[] args) {
		float loan = readUserFloatInput("Enter the loan amount: ");
		float interest = readUserFloatInput("Enter the interest rate: ");
		float time = readUserFloatInput("Enter how long it'll take to pay off the loan in months: ");
//Calculates the EMI
		float interestPerMonth = interest/(1200);
		float EMI1 = loan * interestPerMonth;
		float interest1 = interestPerMonth + 1;
		double interest2 = Math.pow(interest1, time);
		double finalEMI = (EMI1 * (interest2 / (interest2 - 1)));
//Tells user their EMI
		System.out.println("Your have to pay " + finalEMI + " every month");
		
	}
}
