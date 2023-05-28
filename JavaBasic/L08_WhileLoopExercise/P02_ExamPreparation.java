package L08_WhileLoopExercise;

import java.util.Scanner;

public class P02_ExamPreparation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberBadScores = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        String problem ="";
        int score = 0;
        int totalScore = 0;
        int poorScoreCount = 0;
        int problemCount = 0;
        while (!input.equals("Enough")) {
            problemCount++;
            problem = input;
            score = Integer.parseInt(scanner.nextLine());
            totalScore += score;
            if (score <= 4){
                poorScoreCount++;
                if (numberBadScores == poorScoreCount) {
                    System.out.printf("You need a break, %d poor grades.", numberBadScores);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        if (input.equals("Enough")) {
            double avgScore = (double) totalScore / problemCount;

            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", avgScore, problemCount, problem);
        }
    }
}
