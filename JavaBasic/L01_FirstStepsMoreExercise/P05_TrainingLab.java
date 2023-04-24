package L01_FirstStepsMoreExercise;

import java.util.Scanner;

public class P05_TrainingLab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine()) * 100;
        double width = Double.parseDouble(scanner.nextLine()) * 100;

        int desksByRow = (int) ((width - 100)/ 70);
        int desksByCol = (int) (length / 120);

        int workspaces = desksByRow * desksByCol - 3;

        System.out.println(workspaces);
    }
}
