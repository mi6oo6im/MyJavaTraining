package L03_ConditionalStatementsAdvancedTraining;

import java.util.Scanner;

public class P02_WeekendOrWorkingDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String weekday = scanner.nextLine();
        String result = null;

        switch (weekday){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                result = "Working day";
                break;
            case "Saturday":
            case "Sunday":
                result = "Weekend";
                break;
            default:
                result = "Error";
        }
        System.out.println(result);
    }
}
