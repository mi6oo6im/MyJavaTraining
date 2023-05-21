package L04_ConditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class P05_Journey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String vacationType = "";
        double price = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    vacationType = "Camp";
                    price = budget * 0.3;
                    break;
                case "winter":
                    vacationType = "Hotel";
                    price = budget * 0.7;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    vacationType = "Camp";
                    price = budget * 0.4;
                    break;
                case "winter":
                    vacationType = "Hotel";
                    price = budget * 0.8;
                    break;
            }
        } else {
            destination = "Europe";
            vacationType = "Hotel";
            price = budget * 0.9;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", destination, vacationType, price);
    }
}
