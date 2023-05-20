package L03_ConditionalStatementsAdvancedTraining;

import java.util.Scanner;

public class P08_CinemaTicket {

    public static void main(String[] args) {
        //ticket prices
        //Monday	Tuesday	Wednesday	Thursday	Friday	Saturday	Sunday
        //12	    12	    14	        14	        12	    16	        16

        Scanner scanner = new Scanner(System.in);

        String weekDay = scanner.nextLine();

        int price = 0;

        switch (weekDay) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                price = 12;
                break;
            case  "Wednesday":
            case  "Thursday":
                price = 14;
                break;
            case  "Saturday":
            case  "Sunday":
                price = 16;
                break;
        }
        System.out.println(price);
    }
}
