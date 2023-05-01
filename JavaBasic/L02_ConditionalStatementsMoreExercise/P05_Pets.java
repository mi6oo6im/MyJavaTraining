package L02_ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P05_Pets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input:
        int daysCount = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double dogEatsDaily = Double.parseDouble(scanner.nextLine());
        double catEatsDaily = Double.parseDouble(scanner.nextLine());
        double turtleEatsDaily = Double.parseDouble(scanner.nextLine()) / 1000;

        double dogNeedsKg = dogEatsDaily * daysCount;
        double catNeedsKg = catEatsDaily * daysCount;
        double turtleNeedsKg = turtleEatsDaily * daysCount;
        double totalNeededKg = catNeedsKg + dogNeedsKg + turtleNeedsKg;

        if (foodLeft >= totalNeededKg){
            double extraFood = Math.floor(foodLeft - totalNeededKg);
            System.out.printf("%.0f kilos of food left.", extraFood);
        } else {
            double insufficientFood = Math.ceil(totalNeededKg - foodLeft);
            System.out.printf("%.0f more kilos of food are needed.", insufficientFood);
        }
    }
}
