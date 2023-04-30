package L02_ConditionalStatementsExercise;

import java.util.Scanner;

public class P01_SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int timeInSeconds = firstTime + secondTime + thirdTime;
        int timeInMinutes = timeInSeconds / 60;
        int remainingSeconds = timeInSeconds % 60;

        System.out.printf("%d:%02d", timeInMinutes, remainingSeconds);
    }
}
