package L02_ConditionalStatementsExercise;

import java.util.Scanner;

public class P08_LunchBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchDuration = breakDuration / 8.0;
        double relaxDuration = breakDuration / 4.0;

        double timeToWatchEpisode = breakDuration - (lunchDuration + relaxDuration);

        double deltaTime = Math.ceil(Math.abs(timeToWatchEpisode - episodeDuration));

        if (episodeDuration <= timeToWatchEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, deltaTime);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, deltaTime);
        }

    }
}
