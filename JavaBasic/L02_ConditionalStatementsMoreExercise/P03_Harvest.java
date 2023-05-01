package L02_ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P03_Harvest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input:
        int sqMetersVines = Integer.parseInt(scanner.nextLine());
        double kgGrapesPerMeterSq = Double.parseDouble(scanner.nextLine());
        int neededLitersWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double kgGrapes = kgGrapesPerMeterSq * sqMetersVines;
        double kgGrapesForWine = kgGrapes * 0.40;
        double litersWineProduced = kgGrapesForWine / 2.5;

        if (litersWineProduced < neededLitersWine){
            double insufficientWine = Math.floor(neededLitersWine - litersWineProduced);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", insufficientWine);
        } else {
            double extraWine = Math.ceil(litersWineProduced - neededLitersWine);
            double winePerWorker = Math.ceil(extraWine / workers);

            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", litersWineProduced);
            System.out.printf("%.0f liters left -> %.0f liters per person.", extraWine, winePerWorker);
        }
    }
}
