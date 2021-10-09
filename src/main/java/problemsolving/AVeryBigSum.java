package problemsolving;

import java.math.BigInteger;
import java.util.Scanner;

public class AVeryBigSum {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(0);
        byte numberOf=scanner.nextByte();
        for (int i=0;i<numberOf;i++) {
            sum=sum.add(scanner.nextBigInteger());
        }
        System.out.println(sum);
    }
}
