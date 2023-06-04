package L10_NestedLoopsExercise;

import java.util.Scanner;

public class P02_EqualSumsEvenOddPosition {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int  endNum = Integer.parseInt(scanner.nextLine());



        for (int num = startNum; num <= endNum; num++) {
            int sumEven = 0;
            int sumOdd = 0;
            String strNum = String.valueOf(num);
            for (int i = 0; i < strNum.length(); i++) {
                int currentNum = Integer.parseInt(String.valueOf(strNum.charAt(i)));
                if (i % 2 == 0) {
                    sumEven += currentNum;
                } else {
                    sumOdd += currentNum;
                }
            }
            if (sumEven == sumOdd) {
                System.out.print(num + " ");
            }
        }
    }
}
