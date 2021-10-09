package thertydaysofcode;

import java.util.Scanner;

public class DayGfive {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
