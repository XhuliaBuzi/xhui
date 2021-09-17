package JavaPazzel;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();
        BigInteger s = new BigInteger(n);
        System.out.println((s.isProbablePrime(1) && !s.equals(1)) ? "prime" : "not prime");
    }
}
