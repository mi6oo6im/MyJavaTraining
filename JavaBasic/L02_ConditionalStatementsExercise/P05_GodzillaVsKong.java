package L02_ConditionalStatementsExercise;

import java.util.Scanner;

public class P05_GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input:
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int extrasCount = Integer.parseInt(scanner.nextLine());
        double extraCostumePrice = Double.parseDouble(scanner.nextLine());
        double totalExtraCostumeCost = extraCostumePrice * extrasCount;

        double decorCost = movieBudget * 0.1;
        double discount = 0;
        if (extrasCount > 150){
            discount += totalExtraCostumeCost * 0.1;
        }
        double totalCost = decorCost + totalExtraCostumeCost - discount;

        double deltaBudget = movieBudget - totalCost;

        if (deltaBudget >= 0){
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", Math.abs(deltaBudget));
        } else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", Math.abs(deltaBudget));
        }
    }
}
