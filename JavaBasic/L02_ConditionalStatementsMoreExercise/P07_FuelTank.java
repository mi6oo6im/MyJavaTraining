package L02_ConditionalStatementsMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_FuelTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input:
        String fuelType = scanner.nextLine();
        double litersFuel = Double.parseDouble(scanner.nextLine());

        String[] fuelTypes =  {"Diesel", "Gasoline", "Gas"};

        if (Arrays.asList(fuelTypes).contains(fuelType)){
            if (litersFuel >= 25){
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }

    }
}
