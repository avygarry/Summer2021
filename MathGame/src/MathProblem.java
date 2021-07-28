import java.util.Random;

public class MathProblem {

	private int num1;
	private int num2;
	private char operator;
	private int playerAnswer;
	public static char[] operations = { '+', '-', '*', '/', '%' };
	

	public void generateQuestion() {
		int randomOperator = new Random().nextInt(5);
		int randomNum1 = new Random().nextInt(20);
		int randomNum2 = new Random().nextInt(20);
		operator = operations[randomOperator];
		num1 = randomNum1;
		num2 = randomNum2;
	}

	public void printProblem() {
		System.out.println("\t \t" + num1);
		System.out.println("\t " + operator + "\t" + num2);
		System.out.println("--------------------");
	}

	public void recordAnswer(int aAnswer) {
		playerAnswer = aAnswer;
	}

	public int getAnswer() {
		int actualAnswer = 0;
		if (operator == '+') {
			actualAnswer = num1 + num2;
			return actualAnswer;
		}
		if (operator == '-') {
			actualAnswer = num1 - num2;
			return actualAnswer;
		}
		if (operator == '*') {
			actualAnswer = num1 * num2;
			return actualAnswer;
		}
		if (operator == '/') {
			actualAnswer = num1 / num2;
			return actualAnswer;
		}
		if (operator == '%') {
			actualAnswer = num1 % num2;
			return actualAnswer;
		}
		return -1;
	}

	public boolean isRightAnswer() {
		int actualAnswer = getAnswer();
		if (actualAnswer == playerAnswer) {
			return true;
		}
		return false;

	}
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}


	public char getOperator() {
		return operator;
	}

	public int getPlayerAnswer() {
		return playerAnswer;
	}
}
