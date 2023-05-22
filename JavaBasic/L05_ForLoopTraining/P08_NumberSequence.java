package L05_ForLoopTraining;

import java.util.Scanner;

public class P08_NumberSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= number; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        System.out.printf("Max number: %d%nMin number: %d", maxNumber, minNumber);
    }
}
