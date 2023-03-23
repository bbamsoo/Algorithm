package BAEKJOON.Greedy;

import java.io.*;

public class BAEKJOON5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int change = Integer.parseInt(br.readLine());
        change = 1000 - change;
        int[] coin = {500, 100, 50, 10, 5, 1};
        int result = 0;
        for (int i=0;i<6;i++){
            if (change/coin[i]>0){
                result += change / coin[i];
                change %= coin[i];
            }
        }
        bw.write(result+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
