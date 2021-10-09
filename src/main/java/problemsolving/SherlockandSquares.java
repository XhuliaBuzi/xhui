package problemsolving;

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

public class SherlockandSquares {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int fist = scanner.nextInt();
            int last = scanner.nextInt();
            calculate(fist, last);
        }

    }

    public static void calculate(int last, int first) {
        double lastNumber = sqrt(last);
        double firstNumber = sqrt(first);
        double numberOfLastNumber = ceil(lastNumber);
        System.out.println((int) (((lastNumber == numberOfLastNumber) ? 1 : 0) + numberOfLastNumber - ceil(firstNumber)));
    }
}
