import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static int x = 6;
    public static int y = 6;

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String[][] mainBombs;

        mainBombs = plantBombs(createGrid());
        printGrid(mainBombs);
    }
    public static String[][] createGrid() {
        String[][] grid = new String[x][y];
        for(int i = 0; i < y; i++) {
            for(int k = 0;  k < x; k++) {
                grid[i][k] = "O";
            }
        }
        return grid;
    }
    public static void printGrid(String[][] arr) {
        for(int p = 0; p < arr.length; p++) {
            for(int h = 0; h < arr[p].length; h++)
                System.out.print(arr[p][h] + " ");
            System.out.println();
        }
    }
    public static String[][] plantBombs(String[][] field) {
        int bombAmount = x;
        int[][] randomCoords = new int[x][2];
        for(int t = 0; t < bombAmount; t++) {
            randomCoords[t][0] = ThreadLocalRandom.current().nextInt(0, 5 + 1);
            randomCoords[t][1] = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        }

            // field.length is y         field[p].length is x
        for (int i = 0; i < randomCoords.length; i++) {
            int[] coord = randomCoords[i];
            field[coord[0]][coord[1]] = "x";
        }
        return field;
    }

}


/*
                0 1 2 3 4 5
              0 O O O O O O
              1 O O O O O O
              2 O O O O O O
              3 O O O O O O
              4 O O O O O O
              5 O O O O O O
                                randomCoords
                 0       1       2       3       4       5
              [[3, 6], [2, 5], [1, 4], [4, 1], [5, 5], [2, 1]]

 */