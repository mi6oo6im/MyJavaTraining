package L01_FirstStepsExercise;

import java.util.Scanner;

public class P03_Deposit_calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int deposit = Integer.parseInt(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double annualInterest = Double.parseDouble(scanner.nextLine());

        double monthlyInterest = annualInterest / 12;

        double finalAmount = deposit + (deposit * term * monthlyInterest / 100);

        System.out.println(finalAmount);
    }
}
