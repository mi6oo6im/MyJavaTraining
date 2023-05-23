package L06_ForLoopExercise;

import java.util.Scanner;

public class P01_NumbersEndingWith7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 1001; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
