package BAEKJOON.Greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON2437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int []arr=new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int sum=0;
        for (int num:arr){
            if(sum+1<num)
                break;
            sum+=num;
        }
        bw.write((sum+1)+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
