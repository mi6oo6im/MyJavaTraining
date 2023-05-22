package L05_ForLoopTraining;

import java.util.Scanner;

public class P06_VowelsSum {

    public static void main(String[] args) {

        //letter	a	e	i	o	u
        //value 	1	2	3	4	5

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            switch (letter) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
