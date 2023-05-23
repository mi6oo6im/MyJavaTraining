package L06_ForLoopExercise;

import java.util.Scanner;

public class P07_TrackingMania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // group size / peek
        // < 5        / Musala
        // [6: 12]    / Mont Blanc
        // [13: 25]   / Kilimanjaro
        // [26: 40]   / K2
        // > 41       / Everest
        // input:
        int groups = Integer.parseInt(scanner.nextLine());

        int totalClimbers = 0;
        int musalaClimbers = 0;
        int montBlancClimbers = 0;
        int kilimanjaroClimbers = 0;
        int k2Climbers = 0;
        int everestClimbers = 0;

        for (int i = 0; i < groups; i++) {
            int groupSize = Integer.parseInt(scanner.nextLine());
            totalClimbers += groupSize;

            if (groupSize <= 5) {
                musalaClimbers += groupSize;
            } else if (groupSize < 13) {
                montBlancClimbers += groupSize;
            } else if (groupSize < 26) {
                kilimanjaroClimbers += groupSize;
            } else if (groupSize < 41) {
                k2Climbers += groupSize;
            } else {
                everestClimbers += groupSize;
            }
        }
        double musalaPercent = musalaClimbers * 1.0 / totalClimbers * 100;
        double montBlancPercent = montBlancClimbers * 1.0 / totalClimbers * 100;
        double kilimanjaroPercent = kilimanjaroClimbers * 1.0 / totalClimbers * 100;
        double k2Percent = k2Climbers * 1.0 / totalClimbers * 100;
        double everestPercent = everestClimbers * 1.0 / totalClimbers * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", musalaPercent, montBlancPercent,
                kilimanjaroPercent, k2Percent, everestPercent);
    }
}
