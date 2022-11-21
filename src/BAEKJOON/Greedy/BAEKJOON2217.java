package BAEKJOON.Greedy;

import java.io.*;
import java.util.Arrays;

public class BAEKJOON2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int max=-1;
        for (int i=0;i<n;i++){
            max = Math.max(max, arr[i] * (n - i));
        }
        bw.write(max+"");
        bw.flush();
        bw.close();
        br.close();
    }
}