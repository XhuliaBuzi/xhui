package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankLanguage {
    public static void main(String[] args) {
       Compering compering=new Compering();
       compering.comper("^\\d{5,6}\\s(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$");
    }
}
class Compering{
    public void comper(String pattern){
        Scanner scanner=new Scanner(System.in);
        int info=scanner.nextInt();
        String wirdword=scanner.nextLine();
        Pattern p=Pattern.compile(pattern);
        for (int i = 0; i < info; i++) {
            String word=scanner.nextLine();
            Matcher m=p.matcher(word);
            System.out.println(m.find()?"VALID":"INVALID");
        }
    }
}