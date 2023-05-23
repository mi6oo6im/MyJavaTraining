package L06_ForLoopExercise;

import java.util.Scanner;

public class P05_Salary {

    public static void main(String[] args) {
        //•	"Facebook" -> 150
        //•	"Instagram" -> 100
        //•	"Reddit" -> 50
        Scanner scanner = new Scanner(System.in);

        // input:
        int openTabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < openTabs; i++) {
            String tab = scanner.nextLine();
            if (tab.equals("Facebook")) {
                salary -= 150;
            } else if (tab.equals("Instagram")) {
                salary -= 100;
            } else if (tab.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%.0f", salary);
        }
    }
}
