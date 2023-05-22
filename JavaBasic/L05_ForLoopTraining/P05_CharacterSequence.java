package L05_ForLoopTraining;

import java.util.Scanner;

public class P05_CharacterSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int chr = 0; chr < input.length(); chr++) {

            Character c = input.charAt(chr);
            System.out.println(c);
        }
    }
}
