package BAEKJOON.Greedy;

import java.io.*;

public class BAEKJOON14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while (n>0){
            if (n%5==0){
                count+=n/5;
                break;
            }
            n-=2;
            count++;
        }
        bw.write((n<0?-1:count)+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
