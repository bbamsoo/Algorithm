package BAEKJOON.Greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[]wait=new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            wait[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(wait);
        for (int i = 1; i < N; i++) {
            wait[i] += wait[i - 1];
        }

        int sum=0;
        for (int num:wait)
            sum += num;
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
