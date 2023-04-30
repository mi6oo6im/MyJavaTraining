package L02_ConditionalStatementsExercise;

import java.util.Scanner;

public class P06_WorldSwimmingRecord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secondsForMeter = Double.parseDouble(scanner.nextLine());

        double watterResistanceDelay = Math.floor(distanceInMeters / 15) * 12.5;

        double recordAttemptInSeconds = distanceInMeters * secondsForMeter + watterResistanceDelay;

        if (recordInSeconds > recordAttemptInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", recordAttemptInSeconds);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", recordAttemptInSeconds - recordInSeconds);
        }
    }
}
