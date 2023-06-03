package L09_NestedLoopsTraining;

import java.util.Scanner;

public class P05_Travelling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destination = input;
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            while (neededMoney > savedMoney) {
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney += money;
            }
            System.out.printf("Going to %s!%n", destination);
            input = scanner.nextLine();
        }
    }
}
