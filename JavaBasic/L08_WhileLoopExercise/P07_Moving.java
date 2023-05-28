package L08_WhileLoopExercise;

import java.util.Scanner;

public class P07_Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // dimensions:
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        // volume m3:
        int freeVolume = width * length * height;
        String input = "";
        while (true){
            input = scanner.nextLine();
            if (input.equals("Done")){
                if (freeVolume > 0){
                    System.out.printf("%d Cubic meters left.", freeVolume);
                }
                break;
            }
            int cases = Integer.parseInt(input);
            if (freeVolume > cases){
                freeVolume -= cases;
            } else {
                int deltaSpace = cases - freeVolume;
                System.out.printf("No more free space! You need %d Cubic meters more.", deltaSpace);
                break;
            }
        }
    }
}
