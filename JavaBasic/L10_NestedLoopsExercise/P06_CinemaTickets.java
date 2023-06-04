package L10_NestedLoopsExercise;

import java.util.Scanner;

public class P06_CinemaTickets {

    public static void main(String[] args){
        // ticket types: student, standard, kid
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalSeats = 0;
        int totalStudentTickets = 0;
        int totalKidsTickets = 0;
        int totalStandardTickets = 0;
        while (!input.equals("Finish")) {
            String movieName = input;
            int availableSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int occupiedSeats = 0;
            while (!ticketType.equals("End")) {
                occupiedSeats++;
                switch (ticketType){
                    case "student":
                        totalStudentTickets++;
                        break;
                    case "standard":
                        totalStandardTickets++;
                        break;
                    case "kid":
                        totalKidsTickets++;
                        break;
                }
                if (availableSeats == occupiedSeats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            double percentOccupied = (occupiedSeats * 1.0 / availableSeats) * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentOccupied);
            totalSeats += occupiedSeats;
            input = scanner.nextLine();
        }
        double percentStudentTickets = (totalStudentTickets * 1.0 / totalSeats) * 100;
        double percentStandardTickets = (totalStandardTickets * 1.0 / totalSeats) * 100;
        double percentKidsTickets = (totalKidsTickets * 1.0 / totalSeats) * 100;

        System.out.printf("Total tickets: %d%n", totalSeats);
        System.out.printf("%.2f%% student tickets.%n" +
                "%.2f%% standard tickets.%n" +
                "%.2f%% kids tickets.%n", percentStudentTickets, percentStandardTickets, percentKidsTickets);
    }
}
