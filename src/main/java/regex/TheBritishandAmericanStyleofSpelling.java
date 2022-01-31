package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheBritishandAmericanStyleofSpelling {
    public static void main(String[] args) {
BritishAmerican britishAmerican=new BritishAmerican();
britishAmerican.calculateinfo();
    }
}
class BritishAmerican{
    public void calculateinfo(){
        Scanner scanner=new Scanner(System.in);
        List<String> line=new ArrayList<>();
        List<String> words=new ArrayList<>();
        int size=scanner.nextInt();
        String wirdword=scanner.nextLine();
        for (int i = 0; i < size; i++) {
            line.add(scanner.nextLine());
        }
        size=scanner.nextInt();
        wirdword= scanner.nextLine();
        for (int i = 0; i < size; i++) {
            words.add(scanner.nextLine());
        }
        for (int i = 0; i < words.size(); i++) {
            System.out.println( findword(line,wordPattern(words.get(i))));
        }
    }
    private int findword(List<String> line,String word){
        int print=0;
        Pattern p=Pattern.compile(word);
        for (int i = 0; i < line.size(); i++) {
            Matcher m= p.matcher(line.get(i));
            while (m.find()) print++;
        }
        return print;
    }
    private String wordPattern(String word){
        String print="";
       word= word.toLowerCase(Locale.ROOT);
        for (int i = 0; i < word.length(); i++) {
            if(word.length()-1==i)print+=word.charAt(i);
            else{
            if ((String.valueOf(word.charAt(i)).equals("s")&&String.valueOf(word.charAt(i+1)).equals("e"))|| (String.valueOf(word.charAt(i)).equals("z")&&String.valueOf(word.charAt(i+1)).equals("e"))) print+="\\w";
            else print+=word.charAt(i);}
        }
        return print;
    }
}