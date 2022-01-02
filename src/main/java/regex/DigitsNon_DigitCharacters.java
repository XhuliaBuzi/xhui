package regex;

import java.util.Scanner;
import java.util.regex.*;


public class DigitsNon_DigitCharacters {
    public static void main(String[] args) {

        Digit tester = new Digit();
        tester.checker("(\\d{2}\\D){2}\\d{4}"); // Use \\ instead of using \

    }
}

class Digit {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}
