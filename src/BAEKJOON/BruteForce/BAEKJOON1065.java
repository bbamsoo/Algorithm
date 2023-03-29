package BAEKJOON.BruteForce;

import java.io.*;

public class BAEKJOON1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (x<100){
            cnt = x;
        }
        else{
            cnt = 99;

            for (int i=100;i<=x;i++){
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun-ten)==(ten-one)){
                    cnt++;
                }
            }
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
