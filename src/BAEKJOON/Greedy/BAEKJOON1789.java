package BAEKJOON.Greedy;

import java.io.*;

public class BAEKJOON1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Long.parseLong(br.readLine());
        long sum=0;
        int count=0;
        int i=1;
        while(true){
            if(sum>N) break;
            sum+=i;
            i++;
            count++;
        }
        bw.write(count-1+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
