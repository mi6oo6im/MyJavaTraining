package L03_ConditionalStatementsAdvancedTraining;

import java.util.Scanner;

public class P09_FruitOrVegetable {

    public static void main(String[] args) {
        // fruits: banana, apple, kiwi, cherry, lemon or grapes;
        // vegetables: tomato, cucumber, pepper or carrot;
        // else: "unknown"

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();

        if (
                product.equals("banana") ||
                product.equals("apple") ||
                product.equals("kiwi") ||
                product.equals("cherry") ||
                product.equals("lemon") ||
                product.equals("grapes")
        ) {
            System.out.println("fruit");
        } else if (
                product.equals("tomato") ||
                product.equals("cucumber") ||
                product.equals("pepper") ||
                product.equals("carrot")
        ){
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }

    }
}
