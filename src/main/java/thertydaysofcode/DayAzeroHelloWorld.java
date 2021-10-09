package thertydaysofcode;

import java.util.Scanner;

public class DayAzeroHelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);

    }
}