package L01_FirstStepsTraining;
import java.util.Scanner;
public class P03_RectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int result = a * b;
        System.out.println(result);
    }
}
