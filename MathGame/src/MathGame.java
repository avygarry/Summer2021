import java.util.Scanner;

public class MathGame {
	public static void main(String[] args) {
		
		System.out.println("\t\tWelcome to math game");
		String playerName = ReadUserInput.readUserStringInput("Enter player name:");
		System.out.println("\t\tWelcome " + playerName);
		MathProblem[] problems = new MathProblem[10];
		for (int i = 0; i < 10; i++) {
			MathProblem problem = new MathProblem();
			problem.generateQuestion();
			problems[i] = problem;
		}
		            
		
		for (int i = 0; i < 10; i++) {
			int problemNum = i + 1;
			System.out.println("Problem: " + problemNum);
			MathProblem problem = problems[i];
			problem.printProblem();
			int answer = ReadUserInput.readUserIntInput("\t \t");
		}
		String format1 = String.format("| %-14s |  %-7s  | %-11s | %-13s | %-6s |","Problem Number","Problem","User Answer","Actual Answer","Result");
		System.out.println(format1);
		for (int i = 0; i < 10; i++) {
			int problemNum = i + 1;
			MathProblem problem = problems[i];
			int num1 = problem.getNum1();
			int num2 = problem.getNum2();
			char operator = problem.getOperator();
			String correctOrNot = "Incorrect";
			if (problem.isRightAnswer() == true) {
				correctOrNot = "Correct";
			}
			if (problem.isRightAnswer() == false) {
				correctOrNot = "Incorrect";
			}
			String problemString = num1 + " " + operator + " " + num2;
			String formattedString = String.format("| %-24s |  %-15s  | %-11s | %-13s | %-6s |", problemNum, problemString,problem.getPlayerAnswer(), problem.getAnswer(),correctOrNot);
			System.out.println(formattedString);
		}
	}

}