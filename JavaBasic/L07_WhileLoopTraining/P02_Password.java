package L07_WhileLoopTraining;

import java.util.Scanner;

public class P02_Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String tryPassword = scanner.nextLine();

        while (!tryPassword.equals(password)) {
            tryPassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
