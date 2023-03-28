package BAEKJOON.Greedy;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input= br.readLine();
        int sum=Integer.MAX_VALUE;
        StringTokenizer sub=new StringTokenizer(input,"-");
        while (sub.hasMoreElements()){
            int temp=0;
            StringTokenizer add=new StringTokenizer(sub.nextToken(),"+");
            while (add.hasMoreElements()){
                temp+=Integer.parseInt(add.nextToken());
            }
            if(sum==Integer.MAX_VALUE)
                sum=temp;
            else sum-=temp;
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
