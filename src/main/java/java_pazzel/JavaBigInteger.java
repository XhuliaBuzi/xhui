package java_pazzel;

import java.math.BigInteger;
import java.util.Scanner;

//hackerrank.com/challenges/java-biginteger/problem
public class JavaBigInteger {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger firstnumber=scanner.nextBigInteger();
        BigInteger secondnumber=scanner.nextBigInteger();
        BigInteger sum=firstnumber.add(secondnumber);
        BigInteger i=firstnumber.multiply(secondnumber);

        System.out.println(sum);
        System.out.println((i.equals(BigInteger.ZERO))? "":i);
    }
}
