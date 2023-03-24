package BAEKJOON.Greedy;

import java.io.*;

public class BAEKJOON10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] micro = {300, 60, 10};
        int[] result = new int[3];

        for (int i=0;i<3;i++){
            if (t/micro[i]>0){
                result[i] = t / micro[i];
                t %= micro[i];
            }
            else{
                result[i] = 0;
            }
        }
        if (t==0){
            for (int i=0;i<3;i++)
                bw.write(result[i]+" ");
        }
        else bw.write(-1+"");

        bw.flush();
        bw.close();
        br.close();
    }
}