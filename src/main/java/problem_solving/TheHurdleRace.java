package problem_solving;

import java.util.Scanner;

public class TheHurdleRace {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberAray = scanner.nextInt();
        int jumps = scanner.nextInt();
        int max = 0;
        int[] arrayy = new int[numberAray];
        for (int i = 0; i < arrayy.length; i++) {
            arrayy[i] = scanner.nextInt();
            max = Math.max(arrayy[i], max);
        }

        System.out.println(jumps > max ? 0 : max - jumps);

    }

}
