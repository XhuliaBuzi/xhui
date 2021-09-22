package problem_solving;

import java.util.Scanner;

public class DivisibleSumPairs {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int numberOfArray = scanner.nextInt();
private static final int m = scanner.nextInt();
    public static void main(String[] args) {
        int[] intagerArray = new int[numberOfArray];
        for (int i = 0; i < numberOfArray; i++) {
            intagerArray[i] = scanner.nextInt();
        }
        printCalculator(intagerArray, m);

    }

    public static void printCalculator(int[] array, int m) {
        int realsume = 1;
        int tt=0;
        for (int i = 0; i < array.length; i++) {
            for (int t =tt; t < array.length; t++) {
               realsume+=(array[i]+array[t])%m==0?1:0;
                }
            }
tt++;
        System.out.println(realsume);
    }
}