package problemsolving;

import java.util.Scanner;

public class Staircase {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        byte numberOf=scanner.nextByte();
        int number=1;
        for (int i = 0; i <numberOf ; i++) {
            for (int j=0;j<numberOf-number;j++) {System.out.print(" ");}
            for (int k = 0; k < number; k++) {System.out.print("#");}
            number++;
            System.out.println();
        }
    }
}
