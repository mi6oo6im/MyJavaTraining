package L03_ConditionalStatementsAdvancedTraining;

import java.util.Scanner;

public class P07_WorkingHours {

    public static void main(String[] args) {

        // Monday - Saturday -> working hours: 10 - 18

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String weekday = scanner.nextLine();

        if (weekday.equals("Monday") ||
                weekday.equals("Tuesday") ||
                weekday.equals("Wednesday") ||
                weekday.equals("Thursday") ||
                weekday.equals("Friday") ||
                weekday.equals("Saturday")) {
            if (hour >= 10 && hour <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else {System.out.println("closed");}
    }
}
