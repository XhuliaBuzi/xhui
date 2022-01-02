package regex;

import java.util.*;
import java.util.regex.*;

public class MatchingRepetitions {

        public static void main(String[] args) {

            Repetitions tester = new Repetitions();
            tester.checker("^(\\d|\\d{2})[a-zA-Z]{3,}\\.{0,3}$"); // Use \\ instead of using \

        }
    }

    class Repetitions {

        public void checker(String Regex_Pattern){

            Scanner Input = new Scanner(System.in);
            String Test_String = Input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            System.out.println(m.find());
        }

    }