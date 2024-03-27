package BAEKJOON.DP;

import java.io.*;

public class BAEKJOON2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int m=0;m<t;m++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] apt = new int[k + 1][n + 1];
            for (int i=0;i<k+1;i++){
                for (int j=0;j<n+1;j++){
                    if (i==0 || j==0){
                        apt[i][j] = j + 1;
                    }
                    else{
                        apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
                    }
                }
            }
            bw.write(apt[k][n-1]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
