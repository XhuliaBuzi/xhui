package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveLookahead {

        public static void main(String[] args) {
            Regex_FindO regex=new Regex_FindO();
            regex.comper("o(?=oo)");
        }
    }
    class Regex_FindO{
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