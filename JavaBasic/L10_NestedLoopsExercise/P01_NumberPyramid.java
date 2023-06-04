package L10_NestedLoopsExercise;

import java.util.Scanner;

public class P01_NumberPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;
                if (num > n) {
                    return;
                }
            }
            System.out.println();
        }
    }
}
