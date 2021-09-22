package java_pazzel;

import java.util.Scanner;

public class JavaStringTokens {
    private static final Scanner scanner=new Scanner(System.in);
    private static final String strings=scanner.nextLine();
    public static final String[] arrayString = strings.split("[ .,'?!]+");

    public static void main(String[] args) {
        System.out.println(arrayString.length);
        for (String print: arrayString) {
            System.out.println(print);
        }
    }

}
