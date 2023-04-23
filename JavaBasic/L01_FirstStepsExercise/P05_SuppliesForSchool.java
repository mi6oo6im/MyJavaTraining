package L01_FirstStepsExercise;

import java.util.Scanner;

public class P05_SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double penPackPrice = 5.80;
        double highlighterPackPrice = 7.20;
        double cleaningAgentLiterPrice = 1.20;

        int penPacks = Integer.parseInt(scanner.nextLine());
        int highlighterPacks = Integer.parseInt(scanner.nextLine());
        int cleaningAgentLiters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double priceBeforeDiscount = penPacks * penPackPrice + highlighterPacks * highlighterPackPrice +
                cleaningAgentLiters * cleaningAgentLiterPrice;

        double discountAmount = priceBeforeDiscount * discountPercent / 100;

        double finalAmount = priceBeforeDiscount - discountAmount;

        System.out.println(finalAmount);
    }
}
