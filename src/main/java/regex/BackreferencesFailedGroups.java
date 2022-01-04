package regex;

import java.util.*;
import java.util.regex.*;

public class BackreferencesFailedGroups {

        public static void main(String[] args) {

            Regex_BackreferencesFailedGroups tester = new Regex_BackreferencesFailedGroups();
            tester.checker("(^\\d{8}$)|(^(\\d{2}-){3}\\d{2}$)"); // Use \\ instead of using \

        }
    }

    class Regex_BackreferencesFailedGroups {

        public void checker(String Regex_Pattern){

            Scanner Input = new Scanner(System.in);
            String Test_String = Input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            System.out.println(m.find());
        }

    }