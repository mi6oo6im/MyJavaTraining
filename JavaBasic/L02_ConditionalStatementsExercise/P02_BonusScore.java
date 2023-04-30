package L02_ConditionalStatementsExercise;

import java.util.Scanner;

public class P02_BonusScore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double bonus = 0;

        if (number <= 100){
            bonus = 5;
        } else if (number <= 1000){
            bonus = number * 0.2;
        } else {
            bonus = number * 0.1;
        }
        if (number % 2 == 0){
            bonus += 1;
        }
        if (number % 10 == 5){
            bonus += 2;
        }

        System.out.printf("%.1f%n%.1f", bonus, number + bonus);
    }
}
