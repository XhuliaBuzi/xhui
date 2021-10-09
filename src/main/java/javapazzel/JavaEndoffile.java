package javapazzel;

import java.util.Scanner;

public class JavaEndoffile {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=1;
        while(scanner.hasNext()) {
            System.out.println(number+" "+scanner.nextLine());
            number++;
        }
        scanner.close();
    }
}