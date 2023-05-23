package L06_ForLoopExercise;

import java.util.Scanner;

public class P03_Histogram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < 200) {
                p1++;
            } else if (currentNumber < 400) {
                p2++;
            } else if (currentNumber < 600) {
                p3++;
            } else if (currentNumber < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", p1 * 1.0 / number * 100,
                p2 * 1.0 / number * 100, p3 * 1.0 / number * 100, p4 * 1.0 / number * 100, p5 * 1.0 / number * 100);
    }
}
