package L01_FirstStepsMoreExercise;

import java.util.Scanner;

public class P06_FishLand {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double clamsPrice = 7.5;
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double sprinklePrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        double clamsKg = Double.parseDouble(scanner.nextLine());

        double bonitoPrice = mackerelPrice * 1.6;
        double scadPrice = sprinklePrice * 1.8;

        double totalCost = bonitoKg * bonitoPrice + scadKg * scadPrice + clamsKg * clamsPrice;

        System.out.printf("%.2f", totalCost);

    }
}
