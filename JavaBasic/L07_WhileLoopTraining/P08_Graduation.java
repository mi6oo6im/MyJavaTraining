package L07_WhileLoopTraining;

import java.util.Scanner;

public class P08_Graduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pupilName = scanner.nextLine();

        double avgScore = 0.0;

        int graduatedYear = 0;
        int failedYear = 0;
        double sumScore = 0;

        while (graduatedYear < 12) {
            avgScore = Double.parseDouble(scanner.nextLine());
            if (avgScore >= 4.0) {
                graduatedYear ++;
                failedYear = 0;
                sumScore += avgScore;
            } else {
                failedYear ++;
                if (failedYear == 2) {
                    System.out.printf("%s has been excluded at %d grade", pupilName, graduatedYear + 1);
                    break;
                }
            }

        }
        if (graduatedYear == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", pupilName, sumScore / 12);
        }
    }
}
