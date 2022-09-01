package BAEKJOON.Greedy;

import java.util.Scanner;

public class BAEKJOON11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int money=sc.nextInt();
        int count=0;

        int []changes=new int[num];
        for(int i=0;i<num;i++)
            changes[i]=sc.nextInt();
		for(int i=changes.length-1;i>=0;i--) {
            if(money>=changes[i]) {
                count += (money / changes[i]);
                money %= changes[i];
            }
		}
		System.out.println(count);
    }
}
