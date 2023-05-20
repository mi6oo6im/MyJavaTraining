package L03_ConditionalStatementsAdvancedTraining;

import java.util.Scanner;

public class P06_NumberInRange {

    public static void main(String[] args) {
        // [-100;100] -> Yes
        // ![-100;100] -> No

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
