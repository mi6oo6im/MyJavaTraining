package L10_NestedLoopsExercise;

import java.util.Scanner;

public class P03_SumPrimeNonPrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;

        while(!input.equals("stop")){
            int currentNumber = Integer.parseInt(input);

            if (currentNumber < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            boolean isPrime = true;

            for (int num = 2; num < currentNumber; num++) {
                if (currentNumber % num == 0){
                    isPrime = false;
                    sumNonPrime += currentNumber;
                    break;
                }
            }
            if (isPrime){
                sumPrime += currentNumber;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d",sumPrime, sumNonPrime);
    }
}
