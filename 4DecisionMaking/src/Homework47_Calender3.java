import java.util.Scanner;
/**
 * Chapter 4 Homework 7
 * This program will identify how many days will be in that month and ask for the year so it also considers leap years
 * @author Avy
 */
public class Homework47_Calender3 {
	
	public static int readUserIntInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	public static void main(String[] args) {
		
	int month = readUserIntInput ("Enter the month: ");
	int year = readUserIntInput ("Enter the year: ");
	int dayInMonth;
	if (year % 4 == 0 && year % 100 != 0) {
		switch (month) {
		  case 1: dayInMonth = 31;
		break;
		  case 2: dayInMonth = 29;
		break;
		  case 3: dayInMonth = 31;
		break;
		  case 4: dayInMonth = 30;
		break;
		  case 5: dayInMonth = 31;
		break;
		  case 6: dayInMonth = 30;
		break;
		  case 7: dayInMonth = 31;
		break;
		  case 8: dayInMonth = 31;
		break;
		  case 9: dayInMonth = 30;
		break;
		  case 10: dayInMonth = 31;
		break;
		  case 11: dayInMonth = 30;
		break;
		  case 12:dayInMonth = 31;
		break;
		}
		System.out.println(month + ", " + year + " -> " + dayInMonth);
	}else {
			switch (month) {
			  case 1: System.out.println("31");
			break;
			  case 2: System.out.println("28");
			break;
			  case 3: System.out.println("31");
			break;
			  case 4: System.out.println("30");
			break;
			  case 5: System.out.println("31");
			break;
			  case 6: System.out.println("30");
			break;
			  case 7: System.out.println("31");
			break;
			  case 8: System.out.println("31");
			break;
			  case 9: System.out.println("30");
			break;
			  case 10: System.out.println("31");
			break;
			  case 11: System.out.println("30");
			break;
			  case 12: System.out.println("31");
			break;
			System.out.println(month + ", " + year + " -> " + dayInMonth);
			}
			}
		}
	}
