package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPANformat {

    public static void main(String[] args) {
        Regex_TESTV regex_test = new Regex_TESTV();
        regex_test.comper("^[A-Z]{5}[0-9]{4}[A-Z]$");
    }
}

class Regex_TESTV {
    public void comper(String regex_String) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        String wirdSpace = scanner.nextLine();
        for (int i = 0; i < numberOfInput; i++) {
            String Test_String = scanner.nextLine();
            Pattern p = Pattern.compile(regex_String);
            Matcher m = p.matcher(Test_String);
            System.out.println(m.find() ? "YES" : "NO");
        }
    }
}

