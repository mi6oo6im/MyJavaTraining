package L05_ForLoopTraining;

import java.util.Scanner;

public class P09_LetAndRightSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            leftSum += Integer.parseInt(scanner.nextLine());
        }
        for (int j = 0; j < n; j++) {
            rightSum += Integer.parseInt(scanner.nextLine());
        }
        int delta = Math.abs(leftSum - rightSum);

        if (delta > 0) {
            System.out.printf("No, diff = %d", delta);
        } else {
            System.out.printf("Yes, sum = %d", leftSum);
        }
    }
}
