package L07_WhileLoopTraining;

import java.util.Scanner;

public class P04_Sequence2kPlus1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int incrementer = 1;

        while (sum < number) {
            System.out.println(incrementer);
            sum += incrementer;
            incrementer = incrementer * 2 + 1;
        }
    }
}
