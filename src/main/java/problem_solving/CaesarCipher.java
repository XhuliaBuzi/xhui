package problem_solving;

import java.util.Locale;
import java.util.Scanner;

public class CaesarCipher {
    static char[]alphabet="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab".toCharArray();
    static char[]alphabet2="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab".toUpperCase(Locale.ROOT).toCharArray();
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int alb=26;
        int arrayNmber=scanner.nextInt();
        String s=scanner.nextLine()+scanner.nextLine();
        char[]a=s.toCharArray();
        int number=scanner.nextInt();
        while (number>26){number-=alb;}
        for (int i = 0; i < arrayNmber; i++) {
            for (int j = 0; j < 26; j++) {
                if(alphabet[j]==a[i]){
                    a[i]=alphabet[j+number];
                    break;
                }
                else if(alphabet2[j]==a[i]){
                    a[i]=alphabet2[j+number];
                    break;
                }
            }
        }
        for (char print:a) {
            System.out.print(print);
        }
    }

}
