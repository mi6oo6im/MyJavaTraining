package L02_ConditionalStatementsExercise;

import java.util.Scanner;

public class P07_Shopping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int vcuCount = Integer.parseInt(scanner.nextLine());
        int cpuCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double vcuPrice = 250;
        double vcuCost = vcuCount * vcuPrice;
        double cpuPrice = vcuCost * 0.35;
        double cpuCost = cpuCount * cpuPrice;
        double ramPrice = vcuCost * 0.1;
        double ramCost = ramCount * ramPrice;

        double totalCostBeforeDiscount = vcuCost + cpuCost + ramCost;

        double discount = 0;
        if (vcuCount > cpuCount){
            discount += totalCostBeforeDiscount * 0.15;
        }
        double finalCost = totalCostBeforeDiscount - discount;

        if (budget >= finalCost){
            System.out.printf("You have %.2f leva left!", budget - finalCost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalCost - budget);
        }
    }
}
