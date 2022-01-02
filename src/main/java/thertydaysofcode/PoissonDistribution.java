package thertydaysofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoissonDistribution {
    private static final Scanner scanner = new Scanner(System.in);
    private static final double E = 2.71828d;
    private static final double DOUBLE = scanner.nextDouble();
    private static final int K = scanner.nextInt();

    public static void main(String[] args) {
        int kFactorial = 1;
        for (int i = K; i > 0; i--) {
            kFactorial *= i;
        }
        List<String> g=new ArrayList<>();

        System.out.printf("%.3f",((Math.pow(DOUBLE, K) * Math.pow(E, -1* DOUBLE) ) / kFactorial));
    }
}
