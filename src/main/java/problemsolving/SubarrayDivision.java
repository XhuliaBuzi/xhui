package problemsolving;

import java.util.Scanner;

public class SubarrayDivision {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int numberOfArray = scanner.nextInt();

    public static void main(String[] args) {
        var intagerArray = new int[numberOfArray];
        for (int i = 0; i < numberOfArray; i++) {
            intagerArray[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        printCalculator(intagerArray, m, d);

    }

    public static void printCalculator(int[] array, int m, int d) {
        int realsume = 0;
        for (int i = 0; i < array.length; i++) {
            int sumM = 0;
            int tt = i;
            for (int t = 0; t < m; t++) {
                sumM += array[tt];
                tt++;
                if (tt == array.length) {
                    break;
                }
            }
            realsume += (d == sumM) ? 1 : 0;
        }
        System.out.println(realsume);
    }
}
