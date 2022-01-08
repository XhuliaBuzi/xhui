package regex;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NegativeLookbehind {

        public static void main(String[] args) {
            Regex_Negative regex=new Regex_Negative();
            regex.comper("(?<![aeiouAEIOU])(.)");
        }
    }
    class Regex_Negative{
        public void comper(String regex_Pattern){
            Scanner scanner=new Scanner(System.in);
            String word=scanner.nextLine();
            Pattern p=Pattern.compile(regex_Pattern);
            Matcher m=p.matcher(word);
            int i=0;
            while(m.find()){
                i++;
            }
            System.out.println("Number of matches : "+i);
        }
    }

