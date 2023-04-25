package L01_FirstStepsMoreExercise;

import java.util.Scanner;

public class P08_CircleAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double circleArea = Math.PI * Math.pow(r, 2);
        double circleCircumference = 2 * Math.PI * r;

        System.out.printf("%.2f%n%.2f", circleArea, circleCircumference);
    }
}
