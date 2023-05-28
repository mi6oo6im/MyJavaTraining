package L08_WhileLoopExercise;

import java.util.Scanner;

public class P05_Coins_v2_noLoop {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());

        int coins = (int) (amount * 100);

        int coinsCount = 0;

        coinsCount += coins / 200;
        coins = coins % 200;
        coinsCount += coins / 100;
        coins = coins % 100;
        coinsCount += coins / 50;
        coins = coins % 50;
        coinsCount += coins / 20;
        coins = coins % 20;
        coinsCount += coins / 10;
        coins = coins % 10;
        coinsCount += coins / 5;
        coins = coins % 5;
        coinsCount += coins / 2;
        coins = coins % 2;
        coinsCount += coins;

        System.out.println(coinsCount);
        // elapsedTime = stopTime - startTime;
//        long stopTime = System.currentTimeMillis();
//        long elapsedTime = stopTime - startTime;
//        System.out.println(elapsedTime);
    }
}
