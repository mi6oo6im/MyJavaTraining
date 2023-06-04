package L10_NestedLoopsExercise;

import java.util.Scanner;

public class P05_SpecialNumbers {

    public static void main(String[] args) {
        // special numbers: number % each digit == 0
        Scanner scanner = new Scanner(System.in);
        int startNumber = 1111;
        int endNumber = 9999;

        int n = Integer.parseInt(scanner.nextLine());

        for (int num = startNumber; num <= endNumber; num++) {
            String numberAsString = String.valueOf(num);
            boolean isSpecialNumber = true;
            for (int i = 0; i < 4; i++) {
                int currentDigit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));

                if (currentDigit == 0 || n % currentDigit != 0) {
                    isSpecialNumber = false;
                    break;
                }
            }
            if (isSpecialNumber) {
                System.out.print(num + " ");
            }
        }
    }
}
