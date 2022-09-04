package BAEKJOON.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[]wait=new int[N];

        for(int i=0;i<N;i++)
            wait[i]=sc.nextInt();
        Arrays.sort(wait);
        for(int i=1;i<N;i++)
            wait[i]+=wait[i-1];

        int sum=0;
        for (int num:wait)
            sum+=num;
        System.out.println(sum);
    }
}
