package L01_FirstStepsExercise;

import java.util.Scanner;

public class P08_BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int annualCost = Integer.parseInt(scanner.nextLine());

        double snickersCost = annualCost * 0.6;
        double jerseyCost = snickersCost * 0.8;
        double basketballCost = jerseyCost / 4;
        double accessoriesCost = basketballCost / 5;

        double totalCost = annualCost + snickersCost + jerseyCost + basketballCost + accessoriesCost;

        System.out.println(totalCost);
    }
}
