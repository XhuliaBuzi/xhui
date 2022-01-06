package regex;

import java.util.Scanner;

public class IPAddressValidation {

    public static void main(String[] args) {
        String ipV4 = "\\b((([012][0-9][0-5])|([0-9]{1,2}))\\.){3}(([012][0-9][0-5])|([0-9]{1,2}))\\b";
        String ipv6 = "\\b(([0-9a-f]{1,4}):){7}([0-9a-f]{1,4})\\b";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String Rongline = scanner.nextLine();
        while (n > 0) {
            String line = scanner.nextLine();
            if (line.matches(ipV4)) {
                System.out.println("IPv4");

            } else if (line.matches(ipv6)) {
                System.out.println("IPv6");

            } else {
                System.out.println("Neither");
            }
            n--;
        }

    }
}