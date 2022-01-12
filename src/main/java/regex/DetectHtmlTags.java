package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHtmlTags {
    public static void main(String[] args) {
        Regex_Html regex_html = new Regex_Html();
        regex_html.comper("<[\\w]+");
    }
}

class Regex_Html {
    public void comper(String pattern_regex) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Pattern p = Pattern.compile(pattern_regex);
        String wirdline = scanner.nextLine();
        Set<String> stringSet = new HashSet<>();
        List<String> stringList = new ArrayList<>(stringSet);
        for (int j = 0; j < size; j++) {
            String line = scanner.nextLine();
            Matcher matcher = p.matcher(line);
            while (matcher.find()) {
                String[] word = matcher.group(0).split("<");
                stringSet.add(word[1]);
            }
        }
        for (String word : stringSet) {
            stringList.add(word);
        }
        Collections.sort(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            if (i == stringList.size() - 1) System.out.print(stringList.get(i));
            else System.out.print(stringList.get(i) + ";");
        }
    }
}