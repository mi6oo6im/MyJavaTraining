package L04_ConditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class P07_HotelRoom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input:
        String month = scanner.nextLine(); // May, June, July, August, September, October
        int nights = Integer.parseInt(scanner.nextLine());

        // calculate:
        double studioPricePerNight = 0;
        double apartmentPricePerNight = 0;

        switch (month) {
            case "May":
            case "October":
                studioPricePerNight = 50.0;
                apartmentPricePerNight = 65.0;
                break;
            case "June":
            case "September":
                studioPricePerNight = 75.20;
                apartmentPricePerNight = 68.70;
                break;
            case "July":
            case "August":
                studioPricePerNight = 76.0;
                apartmentPricePerNight = 77.0;
                break;
        }
        double studioDiscount = 0;
        double apartmentDiscount = 0;

        if (nights > 14){
            apartmentDiscount = apartmentPricePerNight * 0.10;
            if (month.equals("May") || month.equals("October")) {
                studioDiscount = studioPricePerNight * 0.30;
            } else if (month.equals("June") || month.equals("September")) {
                studioDiscount = studioPricePerNight * 0.20;
            }
        } else if (nights > 7){
            if (month.equals("May") || month.equals("October")) {
                studioDiscount = studioPricePerNight * 0.05;
            }
        }
        double studioPrice = (studioPricePerNight - studioDiscount) * nights;
        double apartmentPrice = (apartmentPricePerNight - apartmentDiscount) * nights;
        // output:
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentPrice, studioPrice);
    }
}
