package L03_ConditionalStatementsAdvancedTraining;

import java.util.Scanner;

public class P03_AnimalClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        String result = null;
        switch (animal) {
            case "dog":
                result = "mammal";
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                result = "reptile";
                break;
            default:
                result = "unknown";
        }
        System.out.println(result);
    }
}
