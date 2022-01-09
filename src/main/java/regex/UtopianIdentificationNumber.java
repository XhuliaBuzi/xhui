package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtopianIdentificationNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int query = scan.nextInt();
        Pattern p = Pattern.compile("^[a-z]{0,3}\\d{2,8}[A-Z]{3,}");
        Matcher m;
        while(scan.hasNext()){
            m = p.matcher(scan.next());
            if(m.find())
                System.out.println("VALID");
            else
                System.out.println("INVALID");
        }
    }
}
