package FirstStepsTraining;

import java.util.Scanner;

public class ProjectsCreation_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int projectHours = 3;
        String architect = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int totalTime = projects * projectHours;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architect, totalTime, projects);

    }
}
