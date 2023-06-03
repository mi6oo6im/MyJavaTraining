package L09_NestedLoopsTraining;

import java.util.Scanner;

public class P06_Building {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int apartments = Integer.parseInt(scanner.nextLine());

        for (int floor = floors; floor > 0; floor--) {
            for (int apartment = 0; apartment < apartments; apartment++) {
                if (floor == floors){
                    System.out.printf("L%d%d ", floor, apartment);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, apartment);
                } else {
                    System.out.printf("A%d%d ", floor, apartment);
                }
            }
            System.out.println();
        }
    }
}
