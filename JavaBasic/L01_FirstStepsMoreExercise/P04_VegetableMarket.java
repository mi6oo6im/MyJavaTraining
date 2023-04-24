package L01_FirstStepsMoreExercise;

import java.util.Scanner;

public class P04_VegetableMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int vegetableWeight = Integer.parseInt(scanner.nextLine());
        int fruitsWeight = Integer.parseInt(scanner.nextLine());

        double cost = vegetableWeight * vegetablesPrice + fruitsWeight * fruitsPrice;
        double costInEuro = cost / 1.94;

        System.out.printf("%.2f", costInEuro);

    }
}
