package problemsolving;

import java.util.Scanner;

public class NumberLineJumps {
    static final int max = 10_000;
    static Scanner scanner = new Scanner(System.in);
    static int start1 = scanner.nextInt();
    static int jumps1 = scanner.nextInt();
    static int start2 = scanner.nextInt();
    static int jumps2 = scanner.nextInt();
    static String print = "NO";

    public static void main(String[] args) {
        if ((start1 >= 0 && start1 < start2 && start2 <= max) && (jumps1 >= 1 && jumps1 <= max) && (jumps2 >= 1 && jumps2 <= max)&&jumps2<jumps1) {
            print = ((start2 - start1) % (jumps1 - jumps2)) == 0 ? "YES" : "NO";
        }
        System.out.println(print);
    }

}