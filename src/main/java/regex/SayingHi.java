package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SayingHi {

        public static void main(String[] args) {
            Regex_testing r=new Regex_testing();
            r.comper("^[hH][Ii]\\s[^dD](\\w{1,10})+");
        }
    }
    class Regex_testing{
        public void comper(String regex_Pattern){
            Scanner scanner=new Scanner(System.in);
            int numberOfWords=scanner.nextInt();
            String wirdWord=scanner.nextLine();
            for(int i=0;i<numberOfWords;i++){
                String word=scanner.nextLine();
                Pattern p=Pattern.compile(regex_Pattern);
                Matcher m=p.matcher(word);
                if(m.find())System.out.println(word);
            }
        }
    }