import java.util.Scanner;

/**
 * Chapter 4 Homework 4
 * This program can tell you what grades you got
 * @author Avy
 */
public class Homework44_GradesCalculator {
	public static int readUserIntInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
//Asks user questions
	public static void main(String[] args) {
		String name = ReadUserInput.readUserStringInput("What's u name babu: ");
		int mathScore = readUserIntInput("Enter your score for Math: ");
		int englishScore = readUserIntInput("Enter your score for English: ");
		int languageScore = readUserIntInput("Enter your score for the Language you take: ");
		int scienceScore = readUserIntInput("Enter your score for Science: ");
		String mathGrade;
		String englishGrade;
		String languageGrade;
		String scienceGrade;
//Calculate the grades
		if (mathScore < 101 && mathScore > 89) {
			 mathGrade = "A+";
		}else if (mathScore < 90 && mathScore > 79) {
			 mathGrade = "A";
		}else if (mathScore < 80 && mathScore > 69) {
			 mathGrade = "B+";
		}else if (mathScore < 70 && mathScore > 59) {
			 mathGrade = "B";
		}else if (mathScore < 60 && mathScore > 49) {
			 mathGrade = "C";
		}else{
			 mathGrade = "F";
		}
		if (englishScore < 101 && englishScore > 89) {
			 englishGrade = "A+";
		}else if (englishScore < 90 && englishScore > 79) {
			 englishGrade = "A";
		}else if (englishScore < 80 && englishScore > 69) {
			 englishGrade = "B+";
		}else if (englishScore < 70 && englishScore > 59) {
			 englishGrade = "B";
		}else if (englishScore < 60 && englishScore > 49) {
			 englishGrade = "C";
		}else{
			 englishGrade = "F";
			}
		if (languageScore < 101 && languageScore > 89) {
			languageGrade = "A+";
		}else if (languageScore < 90 && languageScore > 79) {
			languageGrade = "A";
		}else if (languageScore < 80 && languageScore > 69) {
			languageGrade = "B+";
		}else if (languageScore < 70 && languageScore > 59) {
			languageGrade = "B";
		}else if (languageScore < 60 && languageScore > 49) {
			languageGrade = "C";
		}else{
			languageGrade = "F";
		}
		if (scienceScore < 101 && scienceScore > 89) {
			scienceGrade = "A+";
		}else if (scienceScore < 90 && scienceScore > 79) {
			scienceGrade = "A";
		}else if (scienceScore < 80 && scienceScore > 69) {
			scienceGrade = "B+";
		}else if (scienceScore < 70 && scienceScore > 59) {
			scienceGrade = "B";
		}else if (scienceScore < 60 && scienceScore > 49) {
			scienceGrade = "C";
		}else{
			scienceGrade = "F";
		}
		System.out.println("Name: " + name);
		System.out.println("------------------------------");
		System.out.println("Subject   | Grade | Marks |");
		System.out.println("------------------------------");
		System.out.print("Math       |");
		if (mathGrade == "A+" || mathGrade == "B+") { 
			System.out.print("  " + mathGrade + "      |");
	}
		if (mathGrade == "A" || mathGrade == "B" || mathGrade == "C" || mathGrade == "F") {
			System.out.print("  " + mathGrade + "        |");
	}
		if (mathScore < 10) {
			System.out.println("  " + mathScore + "       |");
		}
		if (mathScore < 100 && mathScore > 9) {
			System.out.println("  " + mathScore + "     |");
		}
		if(mathScore == 100) {
			System.out.println("  " + mathScore + "    |");
		}
		
		System.out.print("English    |");
		if (englishGrade == "A+" || englishGrade == "B+") { 
			System.out.print("  " + englishGrade + "      |");
	}
		if (englishGrade == "A" || englishGrade == "B" || englishGrade == "C" || englishGrade == "F") {
			System.out.print("  " + englishGrade + "        |");
	}
		if (englishScore < 10) {
			System.out.println("  " + englishScore + "       |");
		}
		if (englishScore < 100 && englishScore > 9) {
			System.out.println("  " + englishScore + "     |");
		}
		if(englishScore == 100) {
			System.out.println("  " + englishScore + "    |");
		}
		System.out.print("Language |");
		if (languageGrade == "A+" || languageGrade == "B+") { 
			System.out.print("  " + languageGrade + "      |");
	}
		if (languageGrade == "A" || languageGrade == "B" || languageGrade == "C" || languageGrade == "F") {
			System.out.print("  " + languageGrade + "        |");
	}
		if (languageScore < 10) {
			System.out.println("  " + languageScore + "       |");
		}
		if (languageScore < 100 && languageScore > 9) {
			System.out.println("  " + languageScore + "     |");
		}
		if(languageScore == 100) {
			System.out.println("  " + languageScore + "    |");
		}
		System.out.print("Science   |");
		if (scienceGrade == "A+" || scienceGrade == "B+") { 
			System.out.print("  " + scienceGrade + "      |");
	}
		if (scienceGrade == "A" || scienceGrade == "B" || scienceGrade == "C" || scienceGrade == "F") {
			System.out.print("  " + scienceGrade + "        |");
	}
		if (scienceScore < 10) {
			System.out.println("  " + scienceScore + "       |");
		}
		if (scienceScore < 100 && scienceScore > 9) {
			System.out.println("  " +scienceScore + "     |");
		}
		if(scienceScore == 100) {
			System.out.println("  " + scienceScore + "    |");
		}
	}
}