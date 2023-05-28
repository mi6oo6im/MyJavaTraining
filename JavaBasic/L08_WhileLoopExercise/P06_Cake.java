package L08_WhileLoopExercise;

import java.util.Scanner;

public class P06_Cake {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input cake dimensions:
        int width = Integer.parseInt(scanner.nextLine());
        int depth = Integer.parseInt(scanner.nextLine());

        int remainingPieces = width * depth;
        String input = scanner.nextLine();
        // calculate:
        while (true) {
            if (input.equals("STOP")) {
                if (remainingPieces > 0) {
                    System.out.printf("%d pieces are left.", remainingPieces);
                }
                break;
            }
            remainingPieces -= Integer.parseInt(input);
            if (remainingPieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(remainingPieces));
                break;
            }
            input = scanner.nextLine();
        }

    }
}
