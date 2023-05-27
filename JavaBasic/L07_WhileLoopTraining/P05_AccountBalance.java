package L07_WhileLoopTraining;

import java.util.Scanner;

public class P05_AccountBalance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String endCommand = "NoMoreMoney";
        double balance = 0;

        String input = scanner.nextLine();
        while (!input.equals(endCommand)) {
            double amount = Double.parseDouble(input);
            if (amount >= 0) {
                System.out.printf("Increase: %.2f%n", amount);
                balance += amount;
            } else {
                System.out.println("Invalid operation!");
                break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", balance);
    }
}
