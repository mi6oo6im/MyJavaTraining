package L02_ConditionalStatements;

import java.util.Scanner;

public class P07_AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();

        double area = 0;

        if(figureType.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;

        } else if (figureType.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            area = length * width;

        } else if (figureType.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;

        } else if (figureType.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = base * height / 2;

        }
        System.out.printf("%.3f", area);
    }
}
