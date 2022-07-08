import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int x = 6;
    public static int y = 6;

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String[][] mainField;
        mainField = createGrid();
        printGrid(mainField);

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

    /*

    public static String[][] plantBombs(String[][] field) {

    }

     */
}