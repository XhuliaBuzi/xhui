package regex;

import thertydaysofcode.Scope;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectTheDomainName {
    public static void main(String[] args) {
       RegexDetect regexDetect=new RegexDetect();
       regexDetect.comper("http://\\w*(\\.\\w+){1,3}\\.[A-Za-z]+");
    }
}
class RegexDetect{
    public void comper(String regexPattern){
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        String wirdSpace=scanner.nextLine();
        Set<String> stringSet=new HashSet<>();
        Pattern p=Pattern.compile(regexPattern);
        Matcher m;
        for (int i = 0; i < size; i++) {
            String word=scanner.nextLine();
            m=p.matcher(word);
            while (m.find()){
                String[] a=m.group(0).split("(http://w{3}.)|(http://)");
                stringSet.add(a[1]);
            }
        }
        List<String> print= new ArrayList<>(stringSet);
        Collections.sort(print);
        for (int i = 0; i < print.size(); i++) {
            if(i==print.size()-1) System.out.print(print.get(i));
            else System.out.print(print.get(i)+";");
        }
    }
}
