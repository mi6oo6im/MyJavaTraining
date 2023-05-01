package L02_ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P06_FlowerShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double magnoliaPrice = 3.25;
        double hyacinthPrice = 4;
        double rosePrice = 3.5;
        double cactusPrice = 8;

        //input:
        int magnoliaCount = Integer.parseInt(scanner.nextLine());
        int hyacinthCount = Integer.parseInt(scanner.nextLine());
        int roseCount = Integer.parseInt(scanner.nextLine());
        int cactusCount = Integer.parseInt(scanner.nextLine());
        double giftCost = Double.parseDouble(scanner.nextLine());

        double magnoliaIncome = magnoliaCount * magnoliaPrice;
        double hyacinthIncome = hyacinthCount * hyacinthPrice;
        double roseIncome = roseCount * rosePrice;
        double cactusIncome = cactusCount * cactusPrice;
        double totalIncomeBeforeTax = magnoliaIncome + hyacinthIncome + roseIncome + cactusIncome;
        double tax = totalIncomeBeforeTax * 0.05;
        double totalProfit = totalIncomeBeforeTax - tax;

        if (totalProfit >= giftCost){
            double extraMoney = Math.floor(totalProfit - giftCost);
            System.out.printf("She is left with %.0f leva.", extraMoney);
        } else {
            double borrowMoney = Math.ceil(giftCost - totalProfit);
            System.out.printf("She will have to borrow %.0f leva.", borrowMoney);
        }

    }
}
