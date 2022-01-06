package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlienUsername {

    public static void main(String[] args) {
        Regex_Same regex=new Regex_Same();
        regex.comper("^[_\\.]\\d+[a-zA-Z]*_?$");
    }
}
class Regex_Same{
    public void comper(String regex_Pattern){
        Scanner scanner=new Scanner(System.in);
        int numberOfComperings=scanner.nextInt();
        String WIRDword=scanner.nextLine();
        for(int i=0;i<numberOfComperings;i++){
            String word=scanner.nextLine();
            Pattern p=Pattern.compile(regex_Pattern);
            Matcher m=p.matcher(word);
            System.out.println(m.find()?"VALID":"INVALID");

        }
    }
}
