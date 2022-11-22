package BAEKJOON.DP;

import java.io.*;

public class BAEKJOON9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        long[] dp = new long[101];
        dp[1]=1; dp[2]=1; dp[3]=1; dp[4]=2; dp[5]=2;
        for (int i=6;i<=100;i++){
            dp[i] = dp[i - 1] + dp[i - 5];
        }
        for (int i=0;i<t;i++){
            bw.write(dp[Integer.parseInt(br.readLine())]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}