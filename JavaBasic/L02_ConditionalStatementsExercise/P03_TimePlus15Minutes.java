package L02_ConditionalStatementsExercise;

import java.util.Scanner;

public class P03_TimePlus15Minutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = hours * 60 + minutes + 15;

        int hoursToDisplay = allMinutes / 60;
        int minutesToDisplay = allMinutes % 60;

        if (hoursToDisplay > 23){
            hoursToDisplay -= 24;
        }

        System.out.printf("%d:%02d", hoursToDisplay, minutesToDisplay);
    }
}
