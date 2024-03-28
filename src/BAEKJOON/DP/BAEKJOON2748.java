package BAEKJOON.DP;

import java.io.*;

public class BAEKJOON2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long sum = 1;
        long f1 = 0;
        long f2 = 1;

        for (int i=1;i<n;i++){
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        bw.write(sum+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
