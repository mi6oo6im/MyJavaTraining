package L08_WhileLoopExercise;

import java.util.Scanner;

public class P05_Coins {

    // coins: 200, 100, 50, 20, 10, 5, 2, 1

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int coinsSum = (int) (amount * 100);
        int coinsCount = 0;

        while (coinsSum > 0) {
            coinsCount++;
            if (coinsSum >= 200) {
                coinsSum -= 200;
            } else if (coinsSum >= 100) {
                coinsSum -= 100;
            } else if (coinsSum >= 50) {
                coinsSum -= 50;
            } else if (coinsSum >= 20) {
                coinsSum -= 20;
            } else if (coinsSum >= 10) {
                coinsSum -= 10;
            } else if (coinsSum >= 5) {
                coinsSum -= 5;
            } else if (coinsSum >= 2) {
                coinsSum -= 2;
            } else{
                break;
            }
        }
        System.out.println(coinsCount);
//        long stopTime = System.currentTimeMillis();
//        long elapsedTime = stopTime - startTime;
//        System.out.println(elapsedTime);
    }
}
