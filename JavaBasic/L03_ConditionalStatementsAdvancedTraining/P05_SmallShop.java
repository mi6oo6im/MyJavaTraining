package L03_ConditionalStatementsAdvancedTraining;

import java.util.Scanner;

public class P05_SmallShop {

    public static void main(String[] args) {

        //city /    product	coffee	water	beer	sweets	peanuts
        //Sofia	            0.50	0.80	1.20	1.45	1.60
        //Plovdiv	        0.40	0.70	1.15	1.30	1.50
        //Varna	            0.45	0.70	1.10	1.35	1.55

        double total = 0;
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (city) {
            case "Sofia":
                if (product.equals("coffee")) {
                    total += quantity * 0.50;
                } else if (product.equals("water")) {
                    total += quantity * 0.80;
                } else if (product.equals("beer")) {
                    total += quantity * 1.20;
                } else if (product.equals("sweets")) {
                    total += quantity * 1.45;
                } else if (product.equals("peanuts")) {
                    total += quantity * 1.60;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    total += quantity * 0.40;
                } else if (product.equals("water")) {
                    total += quantity * 0.70;
                } else if (product.equals("beer")) {
                    total += quantity * 1.15;
                } else if (product.equals("sweets")) {
                    total += quantity * 1.30;
                } else if (product.equals("peanuts")) {
                    total += quantity * 1.50;
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    total += quantity * 0.45;
                } else if (product.equals("water")) {
                    total += quantity * 0.70;
                } else if (product.equals("beer")) {
                    total += quantity * 1.10;
                } else if (product.equals("sweets")) {
                    total += quantity * 1.35;
                } else if (product.equals("peanuts")) {
                    total += quantity * 1.55;
                }
                break;
        }
        System.out.println(total);
    }
}
