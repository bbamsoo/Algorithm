package BAEKJOON.DP;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] dp = new int[30][30];
        int t = Integer.parseInt(br.readLine());

        for (int i=0;i<30;i++){
            dp[i][i] = 1;
            dp[i][0] = 1;
        }
        for (int i=2;i<30;i++){
            for (int j=1;j<30;j++){
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        for (int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            bw.write(dp[m][n]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
