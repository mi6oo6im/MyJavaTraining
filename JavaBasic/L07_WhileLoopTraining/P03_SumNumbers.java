package L07_WhileLoopTraining;

import java.util.Scanner;

public class P03_SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int partialNumber = 0;

        int sum = 0;

        while (sum < number) {
            partialNumber = Integer.parseInt(scanner.nextLine());
            sum += partialNumber;

        }

        System.out.println(sum);
    }
}
