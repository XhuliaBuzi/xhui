package regex;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PositiveLookbehind {

        public static void main(String[] args) {
            Regex_positive regex=new Regex_positive();
            regex.comper("(?<=[\\w\\d])[13579]");
        }
    }
    class Regex_positive{
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
