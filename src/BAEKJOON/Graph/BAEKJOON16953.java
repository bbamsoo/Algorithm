package BAEKJOON.Graph;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 1;
        while (a!=b){
            if (b<a){
                count = -1;
                break;
            }
            if (b%10==1) b /= 10;
            else if (b%2==0) b /= 2;
            else{
                count = -1;
                break;
            }
            count++;
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
