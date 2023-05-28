package L08_WhileLoopExercise;

import java.util.Scanner;

public class P05_Coins_v3_forLoop {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());

        int coins = (int) (amount * 100);

        int coinsCount = 0;
        int[] coinsAmount = {200, 100, 50, 20, 10, 5, 2, 1};
        for (int coinAmount : coinsAmount){
            coinsCount += coins / coinAmount;
            coins = coins % coinAmount;
        }

        System.out.println(coinsCount);

/*      elapsedTime = stopTime - startTime;
        int elapsedTime = stopTime - startTime;
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);

 */
    }
}
