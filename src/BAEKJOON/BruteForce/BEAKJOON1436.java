package BAEKJOON.BruteForce;

import java.util.Scanner;

public class BEAKJOON1436 {
    public static int shom(int n) {
        int j = 0;
        int i = 666;
        while(true) {
            String str = Integer.toString(i);
            if(str.contains("666")) j++;
            if(j == n) break;
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(shom(n));
    }
}
