package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EndingItems {

    public static void main(String[] args) {

        Regex_EndingItems tester = new Regex_EndingItems();
        tester.checker("^[A-Za-z]*s$"); // Use \\ instead of using \

    }
}

class Regex_EndingItems {

    public void checker(String Regex_Pattern) {

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}
