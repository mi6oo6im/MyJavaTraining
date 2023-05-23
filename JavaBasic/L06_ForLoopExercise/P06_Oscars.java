package L06_ForLoopExercise;

import java.util.Scanner;

public class P06_Oscars {

    public static void main(String[] args) {
        // input:
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numberJurors = Integer.parseInt(scanner.nextLine());
        String jurorName = "";
        double jurorPoints = 0;
        double totalPoints = academyPoints;
        double neededPoints = 1250.5;
        // calculate:

        for (int i = 0; i < numberJurors; i++) {
            jurorName = scanner.nextLine();
            jurorPoints = Double.parseDouble(scanner.nextLine());
            double currentPoints = jurorName.length() * jurorPoints / 2;
            totalPoints += currentPoints;
            if (totalPoints >= neededPoints) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                break;
            }
        }
        if (totalPoints < neededPoints) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, neededPoints - totalPoints);
        }
    }
}
