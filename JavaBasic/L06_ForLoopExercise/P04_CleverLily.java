package L06_ForLoopExercise;

import java.util.Scanner;

public class P04_CleverLily {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input:
        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        // calculate:
        int evenBirthdays = age / 2;
        int oddBirthdays = age - evenBirthdays;
        int moneyFromToys = oddBirthdays * toyPrice;
        int moneyFromAge = 0;
        int incrementalMoney = 0;
        for (int i = 0; i < evenBirthdays; i++) {
            moneyFromAge += 10 + incrementalMoney;
            incrementalMoney += 10;
        }
        int totalMoney = moneyFromAge + moneyFromToys - evenBirthdays; // the brother steals 1 dollar each even year.

        // output:
        if (totalMoney >= price) {
            System.out.printf("Yes! %.2f", totalMoney - price);
        } else {
            System.out.printf("No! %.2f", price - totalMoney);
        }
    }
}
