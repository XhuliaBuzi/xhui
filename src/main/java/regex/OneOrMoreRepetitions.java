package regex;

import java.util.*;
import java.util.regex.*;

public class OneOrMoreRepetitions {

        public static void main(String[] args) {

            MoreRepetitions tester = new MoreRepetitions();
            tester.checker("^\\d+[A-Z]+[a-z]+$"); // Use \\ instead of using \

        }
    }

    class MoreRepetitions {

        public void checker(String Regex_Pattern){

            Scanner Input = new Scanner(System.in);
            String Test_String = Input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            System.out.println(m.find());
        }

    }