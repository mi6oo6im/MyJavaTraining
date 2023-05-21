package L04_ConditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class P08_OnTimeForTheExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTimeMinutes = (examHour * 60) + examMinute;
        int arrivalTimeMinutes = (arrivalHour * 60) + arrivalMinute;

        int deltaTime = Math.abs(arrivalTimeMinutes - examTimeMinutes);

        if (arrivalTimeMinutes <= examTimeMinutes && deltaTime <= 30) {
            System.out.println("On time");
            if (deltaTime != 0) {
                System.out.printf("%d minutes before the start", deltaTime);
            }
        } else if (arrivalTimeMinutes > examTimeMinutes){
            System.out.println("Late");
            if (deltaTime < 60) {
                System.out.printf("%d minutes after the start", deltaTime);
            } else {
                System.out.printf("%d:%02d hours after the start", deltaTime / 60, deltaTime % 60);
            }
        } else {
            System.out.println("Early");
            if (deltaTime < 60) {
                System.out.printf("%d minutes before the start", deltaTime);
            } else {
                System.out.printf("%d:%02d hours before the start", deltaTime / 60, deltaTime % 60);
            }
        }


    }
}
