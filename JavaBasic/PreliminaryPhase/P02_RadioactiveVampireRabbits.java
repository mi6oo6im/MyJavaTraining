package Dummy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class P02_RadioactiveVampireRabbits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String rowsCols = scanner.nextLine();
        int rows = Integer.parseInt(rowsCols.split(" ")[0]);
        int cols = Integer.parseInt(rowsCols.split(" ")[1]);


        // read string matrix:
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split("");
            System.arraycopy(line, 0, matrix[i], 0, cols);
        }
        // get directions:
        String[] directions = scanner.nextLine().split("");
        //print matrix:
        //matrix


        // directions map:
        HashMap<String, Integer[]> directionsHashMap = new HashMap<>();

        directionsHashMap.put("U", new Integer[]{-1, 0});
        directionsHashMap.put("D", new Integer[]{1, 0});
        directionsHashMap.put("L", new Integer[]{0, -1});
        directionsHashMap.put("R", new Integer[]{0, 1});

        // find player:

        int[] player = new int[]{0, 0};
        Vector<int[]> bunnies = new Vector<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].equals("P")) {
                    player[0] = i;
                    player[1] = j;
                }
                //add new bunnie:
                if (matrix[i][j].equals("B")) {
                    int[] bunny = {i, j};
                    bunnies.add(bunny);
                }
            }
        }
//        //print player:
//        System.out.printf("Player is at (%d, %d)%n", player[0], player[1]);
//        //print bunnies:
//        System.out.println("Bunnies:");
//        for (int[] bunny : bunnies) {
//            System.out.printf("(%d, %d) ", bunny[0], bunny[1]);
//        }
//        //print directions:
//        System.out.printf("Directions: ");
//        for (String direction : directions) {
//            System.out.printf("%s ", direction);
//        }

        // workflow:
        boolean isWon = false;
        boolean isDead = false;
        int[] oldPlayerPos = {0, 0};
        for (String direction : directions) {
            // zero old player position and make a move:
            matrix[player[0]][player[1]] = ".";
            oldPlayerPos[0] = player[0];
            oldPlayerPos[1] = player[1];

            player[0] += directionsHashMap.get(direction)[0];
            player[1] += directionsHashMap.get(direction)[1];
            // if player is out of bounds:
            if (player[0] < 0 || player[0] > rows - 1 || player[1] < 0 || player[1] > cols - 1) {
                isWon = true;
                // if cell is occupied by bunny:
            } else if (matrix[player[0]][player[1]].equals("B")) {
                isDead = true;
            } else {
                matrix[player[0]][player[1]] = "P";
            }
            // bunny spread:
            String[] bunnyDirections = {"U", "D", "L", "R"};
            Vector<int[]> newBunnies = new Vector<>();
            for (int[] bunny : bunnies) {
                for (String bunnyDirection : bunnyDirections) {
                    int[] newBunnyPos = bunny.clone();
                    newBunnyPos[0] += directionsHashMap.get(bunnyDirection)[0];
                    newBunnyPos[1] += directionsHashMap.get(bunnyDirection)[1];

                    // if the new bunny is out of bounds:
                    if (newBunnyPos[0] < 0 || newBunnyPos[0] > rows - 1 || newBunnyPos[1] < 0 || newBunnyPos[1] > cols - 1) {
                        continue;
                    }
                    // if cell is occupied by player:
                    if (newBunnyPos[0] == player[0] && newBunnyPos[1] == player[1]) {
                        isDead = true;
                    }
                    // if cell is occupied by bunny:
                    if (matrix[newBunnyPos[0]][newBunnyPos[1]].equals("B")) {
                        continue;
                    }
                    matrix[newBunnyPos[0]][newBunnyPos[1]] = "B";
                    newBunnies.add(newBunnyPos);
                }
            }
            bunnies.addAll(newBunnies);
            if (isDead || isWon) {
                // print matrix
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                if (isDead) {
                    System.out.printf("dead: %d %d", player[0], player[1]);
                } else {
                    System.out.printf("won: %d %d", oldPlayerPos[0], oldPlayerPos[1]);
                }
                break;
            }
        }
    }
}