package L01_FirstStepsExercise;

import java.util.Scanner;

public class P04_VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int hours = bookPages / pagesPerHour;

        int hoursPerDay = hours / daysToRead;

        System.out.println(hoursPerDay);

    }
}
