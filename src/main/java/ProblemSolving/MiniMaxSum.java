package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/mini-max-sum/problem
public class MiniMaxSum {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        List <Long> numberSum=new ArrayList<>();
        long min=0;
        long max=0;
        for (int i = 0; i < 5; i++) {
            long x=scanner.nextLong();
            if(x>0){
           numberSum.add(x);}
        }
        Collections.sort(numberSum);
        for (int i = 0; i < 5; i++) {
            if(i<4)min+=numberSum.get(i);
            if(i>0) max+=numberSum.get(i);
        }
        System.out.println(min+" "+max);
    }
}
