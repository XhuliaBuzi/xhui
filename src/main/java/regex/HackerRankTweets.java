package regex;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HackerRankTweets {

        public static void main(String[] args) {
            Regex_HackerRank regex=new Regex_HackerRank();
            regex.comper("[hH][aA][Cc][Kk][Ee][Rr]{2}[Aa][Nn][Kk]");
        }
    }
    class Regex_HackerRank{
        public void comper(String regex_Pattern){
            Scanner scanner=new Scanner(System.in);
            int lines=scanner.nextInt();
            String wirdSpace=scanner.nextLine();
            Pattern p=Pattern.compile(regex_Pattern);
            int numberPrinted=0;
            for(int i=0;i<lines;i++){
                String word=scanner.nextLine();
                Matcher m=p.matcher(word);
                while(m.find()){
                    numberPrinted++;
                }
            }
            System.out.println(numberPrinted);
        }
    }