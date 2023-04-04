package BAEKJOON.BruteForce;

import java.io.*;

public class BEAKJOON1436 {
    public static int shom(int n) {
        int j = 0;
        int i = 666;
        while(true) {
            String str = Integer.toString(i);
            if(str.contains("666")) j++;
            if(j == n) break;
            i++;
        }
        return i;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(shom(n)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
