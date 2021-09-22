package problem_solving;

import java.util.Scanner;

public class BeautifulDaysattheMovies {
    static Scanner scanner = new Scanner(System.in);
    static int firstNumber = scanner.nextInt();
    static int lastNumber = scanner.nextInt();
    static int divideBy = scanner.nextInt();

    public static void main(String[] args) {
        System.out.println(calculate());
    }

    public static int calculate() {
        double sum;
        int days = 0;

        int revers;
        for (int i = firstNumber; i <= lastNumber; i++) {
            int reversNumber = 0;
            firstNumber = i;
            while (firstNumber > 0) {
                revers = firstNumber % 10;
                firstNumber = firstNumber / 10;
                reversNumber = (reversNumber * 10) + revers;
            }
            sum = (double) (Math.abs(i - reversNumber)) / divideBy;
            days += (sum == (int) sum) ? 1 : 0;
        }
        return days;
    }
}
