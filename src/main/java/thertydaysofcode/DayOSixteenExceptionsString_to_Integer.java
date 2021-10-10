package thertydaysofcode;

import java.util.Scanner;


public class DayOSixteenExceptionsString_to_Integer {
    private static final Scanner scanner=new Scanner(System.in);
    private static final String string=scanner.next();

    public static void main(String[] args) {
        try{
        System.out.println(Integer.valueOf(string));
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }

    }
}
