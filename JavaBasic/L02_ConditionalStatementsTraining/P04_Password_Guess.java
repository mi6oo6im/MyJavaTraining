package L02_ConditionalStatements;

import java.util.Scanner;

public class P04_Password_Guess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = "s3cr3t!P@ssw0rd";
        String guess = scanner.nextLine();

        if (guess.equals(password)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
