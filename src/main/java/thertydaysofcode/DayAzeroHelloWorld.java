package thertydaysofcode;

import java.io.*;
import java.util.*;


public class DayAzeroHelloWorld {
    public static void main(String[] args) {
        System.out.println(solution("abcrcba"));



    }

        public static int solution(String S) {
            if(S.isEmpty()|S.length()%2==0) return -1;
            else if(S.length()==1) return 0;
            int i =(S.length()-1)/2;
            int last=S.length();
            int print =0;
            for(int j=0; j<i;j++){
                last=last-1;
                if(S.charAt(j)==S.charAt(last)) print++;
                else  return 0;



            }
            return print;



    }
}



