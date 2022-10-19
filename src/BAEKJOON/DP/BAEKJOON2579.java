package BAEKJOON.DP;

import java.io.*;

public class BAEKJOON2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] floor = new int[n+1];
        int[] result = new int[n+1];
        for (int i=1;i<=n;i++){
            floor[i] = Integer.parseInt(br.readLine());
        }
        result[1] = floor[1];
        if (n>=2) {
            result[2] = floor[1] + floor[2];
        }

        for (int i=3;i<=n;i++){
            result[i] = Math.max(result[i - 3] + floor[i - 1], result[i - 2]) + floor[i];
        }
        bw.write(result[n]+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
