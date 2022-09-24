package BAEKJOON.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BAEKJOON2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0;i<input;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        for (int i:arr)
            System.out.println(i);
    }
}
