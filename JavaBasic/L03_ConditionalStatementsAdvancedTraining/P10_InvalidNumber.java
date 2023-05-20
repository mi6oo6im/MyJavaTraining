package L03_ConditionalStatementsAdvancedTraining;

import java.util.Scanner;

public class P10_InvalidNumber {

    public static void main(String[] args) {
        // [100; 200] -> valid
        // else -> invalid
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (!((number >= 100 && number <= 200) || number == 0)) {
            System.out.println("invalid");
        }
    }
}
