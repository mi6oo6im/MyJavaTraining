package L02_ConditionalStatementsExercise;

import java.util.Scanner;

public class P04_ToyShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //toys prices:
        double puzzlePrice = 2.60;
        double dollPrice = 3.0;
        double teddyPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.0;

        //input:
        double tripCost = Double.parseDouble(scanner.nextLine());
        int puzzleNum = Integer.parseInt(scanner.nextLine());
        int dollNum = Integer.parseInt(scanner.nextLine());
        int teddyNum = Integer.parseInt(scanner.nextLine());
        int minionNum = Integer.parseInt(scanner.nextLine());
        int truckNum = Integer.parseInt(scanner.nextLine());

        double incomeBeforeDiscount = puzzleNum * puzzlePrice +
                dollNum * dollPrice + teddyNum * teddyPrice +
                minionNum * minionPrice + truckNum * truckPrice;

        int totalToys = puzzleNum + dollNum + teddyNum + minionNum + truckNum;
        double discount = 0;
        if (totalToys >= 50){
            discount += incomeBeforeDiscount * 0.25;
        }
        double incomeBeforeRent = incomeBeforeDiscount - discount;
        double rent = incomeBeforeRent * 0.1;

        double finalIncome = incomeBeforeRent - rent;

        if (finalIncome >= tripCost){
            System.out.printf("Yes! %.2f lv left.", finalIncome - tripCost);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripCost - finalIncome);
        }

    }
}
