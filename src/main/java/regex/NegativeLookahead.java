package regex;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NegativeLookahead {

        public static void main(String[] args) {
            Regex_FindSomthin regex=new Regex_FindSomthin();
            regex.comper("(.)(?!\\1)");
        }
    }
    class Regex_FindSomthin{
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