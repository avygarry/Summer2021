import java.util.Scanner;

public class MathGame {
  public static void main(String[] args) {
   
    System.out.println("\t\tWelcome to math game");
    String playerName = readUserStringInput("Enter player name:");
    MathProblem[] problems = new MathProblem[10];
    for(int i =0; i < 10; i++) {
      MathProblem problem = new MathProblem();
      problem.generateQuestion();
      problems[i] = problem;
    }
   
    // Present all the problems to player one by one and capture the player answer

    // Print the result.
   
  }
}