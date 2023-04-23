package L01_FirstStepsExercise;

import java.util.Scanner;

public class P06_Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nylonPricePerMSq = 1.5;
        double paintPricePerLiter = 14.5;
        double thinnerPricePerLiter = 5.0;
        double bagsCost = 0.4;

        int nylonMSq = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double materialsCost = (nylonMSq + 2) * nylonPricePerMSq + paintLiters * 1.1 * paintPricePerLiter +
                thinnerLiters * thinnerPricePerLiter + bagsCost;

        double workCost = (materialsCost * 0.3) * workHours;

        double totalCost = materialsCost + workCost;

        System.out.println(totalCost);

    }
}
