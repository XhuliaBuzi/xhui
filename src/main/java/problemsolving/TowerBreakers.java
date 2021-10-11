package problemsolving;

import java.util.Scanner;

class Result {
    private Result() {
        throw new IllegalStateException("Utility class");
    }

    public static int towerBreakers(int n, int m) {
        if (n % 2 != 0) return (m == 1) ? 2 : 1;
        else return 2;
    }
}

public class TowerBreakers {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int NUMBER = scanner.nextInt();

    public static void main(String[] args) {
        for (int i = 0; i < NUMBER; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(Result.towerBreakers(n, m));
        }
    }
}
