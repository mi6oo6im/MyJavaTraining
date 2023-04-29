package L02_ConditionalStatements;

import java.util.Scanner;

public class P06_Speed_Info {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());
        String res = "";
        
        if (speed <= 10){
            res = "slow";
        } else if (speed <= 50) {
            res = "average";
        } else if (speed <= 150) {
            res = "fast";
        } else if (speed <= 1000) {
            res = "ultra fast";
        } else {
            res = "extremely fast";
        }

        System.out.println(res);
    }
}
