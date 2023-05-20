package L03_ConditionalStatementsAdvancedTraining;

import java.util.Scanner;

public class P11_FruitShop {

    public static void main(String[] args) {
        //fruit	            banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //weekday price	    2.50	1.20	0.85	1.45	    2.70	5.50	    3.85
        //weekend price	    2.70	1.25	0.90	1.60	    3.00	5.60	    4.20

        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String weekday = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (weekday) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    quantity *= 2.50;
                } else if (fruit.equals("apple")) {
                    quantity *= 1.20;
                } else if (fruit.equals("orange")) {
                    quantity *= 0.85;
                } else if (fruit.equals("grapefruit")) {
                    quantity *= 1.45;
                } else if (fruit.equals("kiwi")) {
                    quantity *= 2.70;
                } else if (fruit.equals("pineapple")) {
                    quantity *= 5.50;
                } else if (fruit.equals("grapes")) {
                    quantity *= 3.85;
                } else {
                    quantity *= 0;
                }
                break;

            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    quantity *= 2.70;
                } else if (fruit.equals("apple")) {
                    quantity *= 1.25;
                } else if (fruit.equals("orange")) {
                    quantity *= 0.90;
                } else if (fruit.equals("grapefruit")) {
                    quantity *= 1.60;
                } else if (fruit.equals("kiwi")) {
                    quantity *= 3.00;
                } else if (fruit.equals("pineapple")) {
                    quantity *= 5.60;
                } else if (fruit.equals("grapes")) {
                    quantity *= 4.20;
                } else {
                    quantity *= 0;
                }
                break;
                default:
                    quantity *= 0;
                    break;
        }
        if (quantity <= 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", quantity);
        }
    }
}
