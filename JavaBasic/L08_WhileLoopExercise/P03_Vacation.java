package L08_WhileLoopExercise;

import java.util.Scanner;

public class P03_Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input:
        double vacationCost = Double.parseDouble(scanner.nextLine());
        double moneyInHand = Double.parseDouble(scanner.nextLine());
        // variables:
        int daysSpendCount = 0;
        String saveSpend = "";
        double amount = 0;
        int daysCount = 0;
        // logic:
        while (moneyInHand < vacationCost) {
            daysCount++;
            saveSpend = scanner.nextLine();
            amount = Double.parseDouble(scanner.nextLine());

            if (saveSpend.equals("spend")) {
                daysSpendCount++;
                if (amount > moneyInHand) {
                    amount = moneyInHand;
                }
                moneyInHand -= amount;
                if (daysSpendCount == 5){
                    System.out.printf("You can't save the money.%n%d", daysCount);
                    break;
                }
            } else {
                moneyInHand += amount;
                daysSpendCount = 0;
            }
        }
        if (moneyInHand >= vacationCost) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}
