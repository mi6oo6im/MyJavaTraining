package L08_WhileLoopExercise;

import java.util.Scanner;

public class P01_OldBooks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();

        String input = scanner.nextLine();

        int bookCount = 0;
        boolean isBookFound = false;

        while (!input.equals("No More Books")) {
            if (input.equals(bookName)) {
                isBookFound = true;
                break;
            }
            bookCount++;
            input = scanner.nextLine();
        }
        if (isBookFound) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", bookCount);
        }
    }
}