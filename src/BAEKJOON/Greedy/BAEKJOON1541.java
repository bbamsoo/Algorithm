package BAEKJOON.Greedy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BAEKJOON1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        int sum=Integer.MAX_VALUE;
        StringTokenizer sub=new StringTokenizer(input,"-");
        while (sub.hasMoreElements()){
            int temp=0;
            StringTokenizer add=new StringTokenizer(sub.nextToken(),"+");
            while (add.hasMoreElements()){
                temp+=Integer.parseInt(add.nextToken());
            }
            if(sum==Integer.MAX_VALUE)
                sum=temp;
            else sum-=temp;
        }
        System.out.println(sum);
    }
}
