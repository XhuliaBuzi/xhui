package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindASubWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sizee=scanner.nextInt();
        String [] strings=new String[sizee];
        String space=scanner.nextLine();
        for(int i=0;i<sizee;i++){
            space=scanner.nextLine();
            strings[i]=space;
        }
        int size=scanner.nextInt();
        space=scanner.nextLine();
        String[] pattern_regex=new String[size];
        for(int i=0;i<size;i++){
            space=scanner.nextLine();
            pattern_regex[i]=space;
        }
        int print=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<sizee;j++){
                Pattern p=Pattern.compile("\\w"+pattern_regex[i]+"\\w");
                Matcher m=p.matcher(strings[j]);
                while (m.find())print++;
            }

            System.out.println(print);
            print=0;
        }

    }
}
