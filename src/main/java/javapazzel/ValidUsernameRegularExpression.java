package javapazzel;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {

        String patern = "^[a-zA-Z][0-9_|a-zA-Z]{7,29}$";
        Scanner scanner = new Scanner(System.in);
        int strings = Integer.parseInt(scanner.nextLine());
        while (strings-- > 0) {
            String s = scanner.nextLine();
            System.out.println(s.matches(patern) ? "Valid" : "Invalid");
        }
    }
}
