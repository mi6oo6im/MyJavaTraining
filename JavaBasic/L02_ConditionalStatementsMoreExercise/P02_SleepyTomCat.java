package L02_ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P02_SleepyTomCat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int annualPlayMinutesTarget = 30_000;
        int daysInYear = 365;
        int workDayPlayMinutes = 63;
        int holidayPlayMinutes = 127;

        // input:
        int holidaysInYear = Integer.parseInt(scanner.nextLine());

        int workDaysInYear = daysInYear - holidaysInYear;
        int minutesPlay = workDaysInYear * workDayPlayMinutes + holidaysInYear * holidayPlayMinutes;
        int deltaMinutes = Math.abs(minutesPlay - annualPlayMinutesTarget);
        int hoursPlay = deltaMinutes / 60;
        int minutesLeftPlay = deltaMinutes % 60;

        if (annualPlayMinutesTarget < minutesPlay){
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", hoursPlay, minutesLeftPlay);
        } else {
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play",hoursPlay, minutesLeftPlay);
        }

    }
}
