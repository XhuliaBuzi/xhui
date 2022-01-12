package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectingValidLatitudeandLongitudePairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Pattern p = Pattern.compile("\\([\\+\\-]?(([0-9]|[1-8][0-9])(\\.\\d+)?|90(\\.0+)?), [\\+\\-]?(([0-9]{1,2}|1[0-7][0-9])(\\.\\d+)?|180(\\.0+)?)\\)");
        while(N-- > 0) {
            Matcher m = p.matcher(sc.nextLine());             
            if(m.find()) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }                     
        sc.close();
    }
}