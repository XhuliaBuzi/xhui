package javapazzel;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> scan.nextInt());
        scan.close();
        for (int j : a) {
            System.out.println(j);
        }
    }
}
