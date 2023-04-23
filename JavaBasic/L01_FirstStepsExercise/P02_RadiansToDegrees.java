package L01_FirstStepsExercise;

import java.util.Scanner;

public class P02_RadiansToDegrees {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());

        double degree = radians * 180 / Math.PI;

        System.out.println(degree);
    }
}
