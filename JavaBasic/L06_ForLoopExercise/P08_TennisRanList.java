package L06_ForLoopExercise;

import java.util.Scanner;

public class P08_TennisRanList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // W -> winner -> 2000 points
        // F -> finalist -> 1200 points
        // SF -> semifinalist -> 720 points

        // input:
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int tournamentPoints = 0;
        int tournamentWinner = 0;

        // calculation:
        for (int i = 0; i < tournaments; i++) {
            String currentStage = scanner.nextLine();
            switch (currentStage) {
                case "W":
                    tournamentPoints += 2000;
                    tournamentWinner++;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    break;
                default:
                    break;
            }
        }
        double percentWonTournament = tournamentWinner * 1.0 / tournaments * 100;
        double averagePoints = tournamentPoints * 1.0 / tournaments;
        int finalPoints = startingPoints + tournamentPoints;

        // output:
        System.out.printf("Final points: %d%nAverage points: %.0f%n%.2f%%", finalPoints, Math.floor(averagePoints), percentWonTournament);
    }
}
