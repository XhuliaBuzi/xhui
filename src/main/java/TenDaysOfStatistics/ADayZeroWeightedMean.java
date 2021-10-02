package TenDaysOfStatistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ADayZeroWeightedMean {
    static Scanner scanner=new Scanner(System.in);
    private static final int numberofArray=scanner.nextInt();

    public static void main(String[] args) {
        List<Integer> firsList=new ArrayList<>();
        List<Integer> secodList=new ArrayList<>();
        addList(firsList);
        addList(secodList);
        calculateWeighted(firsList,secodList);
    }

    public static void addList(List<Integer> a){
        for (int i = 0; i < numberofArray; i++) {
            a.add(scanner.nextInt());
        }
    }
    public static void calculateWeighted(List<Integer> a,List<Integer> b){
        int sumofTowArrays=0;
        for (int i = 0; i < numberofArray; i++) {
            sumofTowArrays+=a.get(i)*b.get(i);
        }
        Integer sumOfSecondArray=b.stream()
                                  .reduce(0,Integer::sum);
        System.out.printf( "%.1f%n",(double) sumofTowArrays/sumOfSecondArray);
    }
}
