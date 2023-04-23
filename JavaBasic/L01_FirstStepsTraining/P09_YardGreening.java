package L01_FirstStepsTraining;

import java.util.Scanner;

public class P09_YardGreening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());

        double m2Price = 7.61;
        int discount = 18;

        double costBeforeDiscount = area * m2Price;
        double discountAmount = costBeforeDiscount * discount / 100;
        double costAfterDiscount = costBeforeDiscount - discountAmount;

        System.out.printf("The final price is: %f lv.%n", costAfterDiscount);
        System.out.printf("The discount is: %f lv.", discountAmount);

    }
}
