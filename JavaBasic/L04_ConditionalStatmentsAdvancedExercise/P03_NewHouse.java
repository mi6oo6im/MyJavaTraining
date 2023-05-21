package L04_ConditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class P03_NewHouse {

    public static void main(String[] args) {
        //flower:	Roses	    Dahlias     Tulips	    Narcissus  	    Gladiolus
        //price:	5	        3.80	    2.80	    3			    2.50

        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;
        double discount = 0;
        double additionalCost = 0;

        switch (flowerType) {
            case "Roses":
                totalPrice = flowerCount * 5.0;
                if (flowerCount > 80) {
                    discount = totalPrice * 0.1;
                    totalPrice -= discount;
                }
                break;
            case "Dahlias":
                totalPrice = flowerCount * 3.80;
                if (flowerCount > 90) {
                    discount = totalPrice * 0.15;
                    totalPrice -= discount;
                }
                break;
            case "Tulips":
                totalPrice = flowerCount * 2.80;
                if (flowerCount > 80) {
                    discount = totalPrice * 0.15;
                    totalPrice -= discount;
                }
                break;
            case "Narcissus":
                totalPrice = flowerCount * 3.0;
                if (flowerCount < 120) {
                    additionalCost = totalPrice * 0.15;
                    totalPrice += additionalCost;
                }
                break;
            case "Gladiolus":
                totalPrice = flowerCount * 2.50;
                if (flowerCount < 80) {
                    additionalCost = totalPrice * 0.20;
                    totalPrice += additionalCost;
                }
                break;
        }
        double deltaBudget = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, deltaBudget);
        } else {
             System.out.printf("Not enough money, you need %.2f leva more.", deltaBudget);
        }
    }
}
