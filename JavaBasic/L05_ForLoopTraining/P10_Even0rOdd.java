package L05_ForLoopTraining;

import java.util.Scanner;

public class P10_Even0rOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int oddNumbers = 0;
        int evenNumbers = 0;

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenNumbers += currentNumber;
            } else {
                oddNumbers += currentNumber;
            }
        }
        if (oddNumbers == evenNumbers) {
            System.out.printf("Yes%nSum = %d", oddNumbers);
        } else {
            int absDelta = Math.abs(oddNumbers - evenNumbers);
            System.out.printf("No%nDiff = %d", absDelta);
        }
    }
}
