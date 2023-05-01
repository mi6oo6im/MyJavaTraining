package L02_ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P08_FuelTankV2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //fuel prices:
        double gasoline = 2.22;
        double diesel = 2.33;
        double gas = 0.93;

        //input:
        String fuelType = scanner.nextLine();
        double fuelLiters = Double.parseDouble(scanner.nextLine());
        String hasLoyaltyCard = scanner.nextLine();

        double discount = 0;
        double cost = 0;
        double discountPerLiterGasoline = 0.18;
        double discountPerLiterDiesel = 0.12;
        double discountPerLiterGas = 0.08;


        switch (fuelType){
            case "Gas":
                cost = fuelLiters * gas;
                discount = fuelLiters * discountPerLiterGas;
                break;
            case "Diesel":
                cost = fuelLiters * diesel;
                discount = fuelLiters * discountPerLiterDiesel;
                break;
            case "Gasoline":
                cost = fuelLiters * gasoline;
                discount = fuelLiters * discountPerLiterGasoline;
                break;
        }
        double extraDiscount = 0;

        if (hasLoyaltyCard.equals("No")){
            discount = 0;
        }

        if (fuelLiters >= 20 && fuelLiters <= 25){
            extraDiscount = (cost - discount) * 0.08;
        } else if (fuelLiters > 25){
            extraDiscount = (cost - discount) * 0.1;
        }
        System.out.printf("%.2f lv.", cost - discount - extraDiscount);
    }
}
