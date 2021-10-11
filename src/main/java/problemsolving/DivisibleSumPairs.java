package problemsolving;

import java.util.Scanner;

public class DivisibleSumPairs {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int numberOfArray = scanner.nextInt();
    private static final int m = scanner.nextInt();

    public static void main(String[] args) {
        int[] ints = new int[numberOfArray];
        for (int i = 0; i < numberOfArray; i++) {
            ints[i] = scanner.nextInt();
        }
        printCalculator(ints, m);
    }

    public static void printCalculator(int[] array, int m) {
        int r = 0;
        for (int i = 0; i < array.length; i++) {
            for (int t =i+1; t < array.length; t++) {
                r+=((array[i]+array[t])%m==0)?1:0;
            }
        }
        System.out.println(r);
    }
}
