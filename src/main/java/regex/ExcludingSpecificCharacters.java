package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExcludingSpecificCharacters {

    public static void main(String[] args) {

        SpecificCharactersA tester = new SpecificCharactersA();
        tester.checker("^[^\\d][^aeiou][^bcDF][\\S][^AEIOU][^.,]$"); // Use \\ instead of using \

    }
}

class SpecificCharactersA {

    public void checker(String Regex_Pattern) {

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}
