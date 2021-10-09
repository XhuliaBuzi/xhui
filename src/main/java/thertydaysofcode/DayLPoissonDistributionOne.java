package thertydaysofcode;

import java.util.Scanner;

public class DayLPoissonDistributionOne {
    private static final Scanner scanner = new Scanner(System.in);
    private static final double e = 2.71828d;
    private static final double avaragnumber = scanner.nextDouble();
    private static final int k = scanner.nextInt();

    public static void main(String[] args) {
        int kFactorial = 1;
        for (int i = k; i > 0; i--) {
            kFactorial *= i;
        }
        System.out.printf("%.3f",((Math.pow(avaragnumber, k) * Math.pow(e, -1*avaragnumber) ) / kFactorial));
    }
}
