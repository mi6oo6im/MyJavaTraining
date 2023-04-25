package L01_FirstStepsMoreExercise;

import java.util.Objects;
import java.util.Scanner;

public class P09_WeatherForecast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String forecast = scanner.nextLine();

        if(Objects.equals(forecast, "sunny")){
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}
