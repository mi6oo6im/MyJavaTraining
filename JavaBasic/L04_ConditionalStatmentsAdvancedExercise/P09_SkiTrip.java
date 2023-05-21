package L04_ConditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class P09_SkiTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input:
        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String typeOfRoom = scanner.nextLine(); // "room for one person", "apartment" or "president apartment"
        String appraisalType = scanner.nextLine(); // "positive" or "negative"

        // calculate:
        double costPerNight = 0;

        switch (typeOfRoom) {
            case "room for one person":
                costPerNight = 18.0;
                break;
            case "apartment":
                costPerNight = 25.0;
                if (days < 10){
                    costPerNight -= costPerNight * 0.3;
                } else if (days <= 15){
                    costPerNight -= costPerNight * 0.35;
                } else {
                    costPerNight -= costPerNight * 0.5;
                }
                break;
            case "president apartment":
                costPerNight = 35.0;
                if (days < 10){
                    costPerNight -= costPerNight * 0.1;
                } else if (days <= 15){
                    costPerNight -= costPerNight * 0.15;
                } else {
                    costPerNight -= costPerNight * 0.2;
                }
                break;
        }
        if (appraisalType.equals("positive")) {
            costPerNight += costPerNight * 0.25;
        } else {
            costPerNight -= costPerNight * 0.1;
        }
        System.out.printf("%.2f", costPerNight * nights);
    }
}
