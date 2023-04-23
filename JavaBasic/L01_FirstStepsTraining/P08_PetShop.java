package L01_FirstStepsTraining;

import java.util.Scanner;

public class P08_PetShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dogFoodPacks = Integer.parseInt(scanner.nextLine());
        int catFoodPacks = Integer.parseInt(scanner.nextLine());

        double dogFoodCost = 2.5;
        double catFoodCost = 4;

        double finalCost = dogFoodCost * dogFoodPacks + catFoodCost * catFoodPacks;

        System.out.printf("%f lv.", finalCost);
    }
}
