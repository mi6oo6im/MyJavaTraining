package L10_NestedLoopsExercise;

import java.util.Scanner;

public class P04_TrainTheTrainers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int judges = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        double totalScore = 0;
        int presentationsCount = 0;

        while (!input.equals("Finish")) {
            String topic = input;
            double sumScoreByTopic = 0;
            presentationsCount++;
            for (int scoreIndex = 0; scoreIndex < judges; scoreIndex++) {
                double currentScore = Double.parseDouble(scanner.nextLine());
                sumScoreByTopic += currentScore;
            }
            double avgScoreTopic = sumScoreByTopic / judges;
            System.out.printf("%s - %.2f.%n", topic, avgScoreTopic);
            totalScore += avgScoreTopic;

            input = scanner.nextLine();
        }
        double finalScore = totalScore / presentationsCount;
        System.out.printf("Student's final assessment is %.2f.", finalScore);
    }
}
