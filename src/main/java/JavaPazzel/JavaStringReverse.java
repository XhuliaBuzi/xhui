package JavaPazzel;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        System.out.println(A.equals(new StringBuilder(A).reverse().toString())?"Yes":"No");
    }
}
