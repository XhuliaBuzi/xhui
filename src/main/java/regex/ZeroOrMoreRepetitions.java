package regex;

import java.util.*;
import java.util.regex.*;

public class ZeroOrMoreRepetitions {

        public static void main(String[] args) {

            ZeroOr tester = new ZeroOr();
            tester.checker("^\\d{2,}[a-z]*[A-Z]*$"); // Use \\ instead of using \

        }
    }

    class ZeroOr {

        public void checker(String Regex_Pattern){

            Scanner Input = new Scanner(System.in);
            String Test_String = Input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            System.out.println(m.find());
        }

    }
