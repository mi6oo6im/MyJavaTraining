package L01_FirstStepsMoreExercise;

import java.util.Scanner;

public class P07_HousePainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double houseLength = Double.parseDouble(scanner.nextLine());
        double houseTriangleHeight = Double.parseDouble(scanner.nextLine());
        double greenPaintSqMetersPerLiter = 3.4;
        double redPaintSqMetersPerLiter = 4.3;

        double doorHeight = 1.2;
        double doorWidth = 2;

        double windowSide = 1.5;

        double windowArea = Math.pow(windowSide, 2);
        double doorArea = doorWidth * doorHeight;

        double frontArea = Math.pow(houseHeight, 2);
        double sideArea = houseHeight * houseLength;
        double triangleArea = houseHeight * houseTriangleHeight / 2;

        double greenArea = frontArea * 2 + sideArea * 2 - (doorArea + 2 * windowArea);
        double redArea = triangleArea * 2 + sideArea * 2;

        double greenLiters = greenArea / greenPaintSqMetersPerLiter;
        double redLiters = redArea / redPaintSqMetersPerLiter;

        System.out.printf("%.2f%n", greenLiters);
        System.out.printf("%.2f", redLiters);
    }
}
