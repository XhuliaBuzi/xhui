package problemsolving;

import java.util.Scanner;

public class DiagonalDifference {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int numberArray = scanner.nextInt();
    private static final int[][] arr = new int[numberArray][numberArray];


    public static void main(String[] args) {
        arrayAdd(numberArray);
        System.out.println(calculateDiagonalDiference());
    }

    public static void arrayAdd(int arrayNumber) {
        for (int i = 0; i < arrayNumber; i++) {
            for (int j = 0; j < arrayNumber; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static int calculateDiagonalDiference() {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0; i < (arr.length); i++) {
            primaryDiagonal = primaryDiagonal + arr[i][i];
            secondaryDiagonal = secondaryDiagonal + arr[i][(arr.length - 1) - i];
        }
        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }
}
