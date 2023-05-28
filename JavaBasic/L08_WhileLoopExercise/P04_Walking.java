package L08_WhileLoopExercise;

import java.util.Scanner;

public class P04_Walking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stepsGoal = 10_000;
        int steps = 0;
        String input = scanner.nextLine();
        while (true){
            if (input.equals("Going home")){
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                steps += stepsToHome;
                break;
            } else {
                steps += Integer.parseInt(input);
            }
            if (steps >= stepsGoal){
                break;
            }
            input = scanner.nextLine();
        }
        int deltaSteps = steps - stepsGoal;

        if (deltaSteps > 0){
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(deltaSteps));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(deltaSteps));
        }
    }
}
