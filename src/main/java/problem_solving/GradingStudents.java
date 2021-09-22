package problem_solving;

import java.util.Scanner;

public class GradingStudents {
    static Scanner scanner = new Scanner(System.in);
    static int v = scanner.nextInt();

    public static void main(String[] args) {
        double[] listInt = new double[v];
        for (int i = 0; i < v; i++) {
            listInt[i] = scanner.nextDouble();
            long l = (Math.round(listInt[i] / 10)) * 10;
            double k = (Math.round(listInt[i] % 10) < 5) ? (l + 5) : l;
            if (k >= 40) {
                double calculate = k - listInt[i];
                if (calculate < 3) {
                    listInt[i] = k;
                }
            }
            System.out.println((int) listInt[i]);

        }
    }
}
