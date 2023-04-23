package L01_FirstStepsExercise;

import java.util.Scanner;

public class P09_FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentFilled = Double.parseDouble(scanner.nextLine());

        int aquariumAreaCubicCm = length * width * height;
        double aquariumAreaLiters = aquariumAreaCubicCm / 1000.0;

        double litersNeeded = aquariumAreaLiters * (1 - percentFilled / 100);

        System.out.println(litersNeeded);
    }
}
