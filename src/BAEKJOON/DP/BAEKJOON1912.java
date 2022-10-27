package BAEKJOON.DP;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int dp[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = dp[0] = arr[0];

        for(int i=1;i<n;i++){
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }
        bw.write(max+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
