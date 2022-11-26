package BAEKJOON.DP;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n + 1];
        for (int i=0;i<n;i++){
            if (i+arr[i][0]<=n){
                dp[i + arr[i][0]] = Math.max(dp[i + arr[i][0]], dp[i] + arr[i][1]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }
        bw.write(dp[n]+"");
        bw.flush();
        bw.close();
        br.close();
    }
}