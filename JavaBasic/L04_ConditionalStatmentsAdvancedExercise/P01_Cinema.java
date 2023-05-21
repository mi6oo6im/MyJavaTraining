package L04_ConditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class P01_Cinema {

    public static void main(String[] args) {
        // type:    Premier     Normal      Discount
        // price:   12.0        7.5         5.0
        Scanner scanner = new Scanner(System.in);
        double singlePrice = 0;
        double income = 0;
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        switch (type) {
            case "Premiere":
                singlePrice = 12.0;
                break;
            case "Normal":
                singlePrice = 7.5;
                break;
            case "Discount":
                singlePrice = 5.0;
                break;
            default:
                break;
        }
        income = rows * cols * singlePrice;
        System.out.printf("%.2f leva", income);
    }
}
