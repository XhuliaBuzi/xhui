package thertydaysofcode;

import java.util.Scanner;


public class ExceptionsStringtoInteger {
    private static final Scanner scanner=new Scanner(System.in);
    private static final String STRING =scanner.next();

    public static void main(String[] args) {
        try{
        System.out.println(Integer.valueOf(STRING));
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }

    }
}
