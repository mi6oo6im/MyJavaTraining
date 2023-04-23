package L01_FirstStepsExercise;

import java.util.Scanner;

public class P07_FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double chickenMealCost = 10.35;
        double fishMealCost = 12.40;
        double veggieMealCost = 8.15;
        double deliveryCost = 2.5;

        int chickenMeals = Integer.parseInt(scanner.nextLine());
        int fishMeals = Integer.parseInt(scanner.nextLine());
        int veggieMeals = Integer.parseInt(scanner.nextLine());

        double orderBeforeDesertCost = chickenMeals * chickenMealCost + fishMeals * fishMealCost +
                veggieMeals * veggieMealCost;

        double desertCost = orderBeforeDesertCost * 0.2;

        double totalOrderCost = orderBeforeDesertCost + desertCost + deliveryCost;

        System.out.println(totalOrderCost);


    }
}
