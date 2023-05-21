package L04_ConditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class P04_FishingBoat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // input:
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        int boatPrice = 0;
        double totalPrice = 0;
        double discount = 0;
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }
        if (fishermen <= 6) {
            discount = boatPrice * 0.10;
        } else if (fishermen <= 11) {
            discount = boatPrice * 0.15;
        } else {
            discount = boatPrice * 0.25;
        }
        totalPrice = boatPrice - discount;
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            totalPrice -= totalPrice * 0.05;
        }
        double deltaBudget = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", deltaBudget);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", deltaBudget);
        }
    }
}
