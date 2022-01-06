package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SameTextAgainAgain {

    public static void main(String[] args) {
        Regex_Copy regex=new Regex_Copy();
        regex.comper("^([a-z]\\w\\s\\W\\d\\D[A-Z][A-Za-z][aAoOeEuUiI]\\S)\\1$");

    }
}

class Regex_Copy{
    public void comper(String regex_Pattern){
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        Pattern p=Pattern.compile(regex_Pattern);
        Matcher m=p.matcher(word);
        System.out.println(m.find());
    }
}
