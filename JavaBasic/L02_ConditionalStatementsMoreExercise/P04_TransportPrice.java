package L02_ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P04_TransportPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kilometersTraveled = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double taxiInitialCharge = 0.7;
        double taxi = 0;
        double bus = 0;
        double train = 0;
        double result = 0;
        switch (dayOrNight) {
            case "day" :
                taxi = 0.79;
                bus = 0.09;
                train = 0.06;
                break;
            case "night":
                taxi = 0.9;
                bus = 0.09;
                train = 0.06;
                break;
        }
        if (kilometersTraveled >= 100){
            double taxiRide = kilometersTraveled * taxi + taxiInitialCharge;
            double busRide = kilometersTraveled * bus;
            double trainRide = kilometersTraveled * train;
            double lowestCost = taxiRide;
            double[] costsArr = {taxiRide, busRide, trainRide};
            for (double cost :costsArr){
                if (lowestCost > cost){
                    lowestCost = cost;
                }
            }
            result = lowestCost;
        } else if(kilometersTraveled >= 20){
            double taxiRide = kilometersTraveled * taxi + taxiInitialCharge;
            double busRide = kilometersTraveled * bus;
            double lowestCost = taxiRide;
            double[] costsArr = {taxiRide, busRide};
            for (double cost :costsArr){
                if (lowestCost > cost){
                    lowestCost = cost;
                }
            }
            result = lowestCost;
        } else {
            result = kilometersTraveled * taxi + taxiInitialCharge;
        }
        System.out.printf("%.2f", result);
    }
}
