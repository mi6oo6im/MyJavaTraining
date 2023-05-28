package Dummy;

import java.util.Scanner;

public class P01_DiagonalSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        //read matrix from console for 'rows' rows
        int[][] matrix = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            String[] input = scanner.nextLine().split(", ");
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        // calculate diagonal sums
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        String[] primaryDiagonal = new String[rows];
        String[] secondaryDiagonal = new String[rows];
        String leftDiagonal = "";
        String rightDiagonal = "";
        for (int i = 0; i < rows; i++) {
            leftDiagonalSum += matrix[i][i];
            //parse int to char
            primaryDiagonal[i] = String.valueOf(matrix[i][i]);
            rightDiagonalSum += matrix[i][rows - i - 1];
            secondaryDiagonal[i] = String.valueOf(matrix[i][rows - i - 1]);
        }
        leftDiagonal = String.join(", ", primaryDiagonal);
        rightDiagonal = String.join(", ", secondaryDiagonal);
        System.out.printf("Primary diagonal: %s. Sum: %d%n", leftDiagonal, leftDiagonalSum);
        System.out.printf("Secondary diagonal: %s. Sum: %d", rightDiagonal, rightDiagonalSum);
    }
}
