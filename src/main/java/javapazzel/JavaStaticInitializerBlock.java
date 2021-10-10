package javapazzel;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static Scanner scanner=new Scanner(System.in);
    public static byte b =scanner.nextByte();
    public static byte H=scanner.nextByte();
    public static boolean flag= b >0&&H>0;
    static {if(!flag){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }}
    public static void main(String[] args){
        if(flag){
            System.out.print(b *H);
        }}
}
