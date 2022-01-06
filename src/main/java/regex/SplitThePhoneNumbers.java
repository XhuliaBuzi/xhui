package regex;

import java.util.Scanner;

public class SplitThePhoneNumbers {

    public static void main(String[] args) {
        Regex_Splet regex_splet = new Regex_Splet();
        regex_splet.comper("[\\s-]");
    }
}

class Regex_Splet {
    public void comper(String regex_Pattern) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfPhone = scanner.nextInt();
        String wirdSpace = scanner.nextLine();
        for (int i = 0; i < numbersOfPhone; i++) {
            String word = scanner.nextLine();
            String[] word_Splited = word.split(regex_Pattern);
            if (word_Splited.length == 3) {
                System.out.print("CountryCode=" + word_Splited[0]
                        + ",LocalAreaCode=" + word_Splited[1]
                        + ",Number=" + word_Splited[2]);
            }
        }
    }
}