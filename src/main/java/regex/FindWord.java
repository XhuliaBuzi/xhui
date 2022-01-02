package regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> printEmails = new ArrayList<>();
        int lines = scanner.nextInt();
        scanner.nextLine();
        while (lines-- > 0) {
            myList.add(scanner.nextLine());
        }
        for (String s : myList) {
            Pattern p = Pattern.compile("\\w{1,}@\\w{1,}.com");
            Matcher m = p.matcher(s);
            if (m.find()) {
                printEmails.add(m.group());
            }
        }
        Collections.sort(printEmails);
        for (int i = 0; i < printEmails.size(); i++) {
            if(!printEmails.get(i).equals(printEmails.get(i - 1))){
            System.out.print(printEmails.get(i));
            if(printEmails.size()-1==i) break;
            System.out.print(";");}
        }
    }
}