package L06_ForLoopExercise;

import java.util.Scanner;

public class P02_HalfSumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int sumNumbers = 0;
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            sumNumbers += currentNumber;
        }
        if (sumNumbers * 1.0 / 2 == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %s", maxNumber);
        } else {
            int absDelta = Math.abs(maxNumber - (sumNumbers - maxNumber));
            System.out.println("No");
            System.out.printf("Diff = %s", absDelta);
        }
    }
}
