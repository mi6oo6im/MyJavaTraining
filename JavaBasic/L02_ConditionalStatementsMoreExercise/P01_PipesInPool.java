package L02_ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P01_PipesInPool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input:
        int poolVolumeLiters = Integer.parseInt(scanner.nextLine());
        int pipe1Debit = Integer.parseInt(scanner.nextLine());
        int pipe2Debit = Integer.parseInt(scanner.nextLine());
        double hoursAbsent = Double.parseDouble(scanner.nextLine());

        double litersFilled = (pipe1Debit + pipe2Debit) * hoursAbsent;
        double pipe1Percent = pipe1Debit * hoursAbsent / litersFilled * 100;
        double pipe2Percent = pipe2Debit * hoursAbsent / litersFilled * 100;
        double filledPercent = litersFilled / poolVolumeLiters * 100;

        if (filledPercent <= 100){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", filledPercent, pipe1Percent, pipe2Percent);
        } else {
            double litersOverflow = litersFilled - poolVolumeLiters;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursAbsent, litersOverflow);
        }
    }
}
