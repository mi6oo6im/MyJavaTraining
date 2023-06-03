package L09_NestedLoopsTraining;

import java.util.Scanner;

public class P04_SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        boolean isMagic = false;
        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                combinations++;
                if (i + j == magicNumber) {
                    isMagic = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, j, magicNumber);
                    break;
                }
            }
            if (isMagic) {
                break;
            }
        }
        if (!isMagic) {
            System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
        }
    }
}
