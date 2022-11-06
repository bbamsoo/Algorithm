package BAEKJOON.BruteForce;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BAEKJOON4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean check[] = new boolean[10001];
        for (int i=1;i<10001;i++){
            int n = d(i);
            if(n<10001){
                check[n]=true;
            }
        }
        for (int i=1;i<10001;i++){
            if(!check[i]){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
    public static int d(int n){
        int sum = n;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
        return sum;
    }
}
