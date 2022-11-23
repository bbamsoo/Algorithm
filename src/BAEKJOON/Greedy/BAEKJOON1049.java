package BAEKJOON.Greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] set = new int[m];
        int[] single = new int[m];
        int result = -1;
        for (int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            set[i] = Integer.parseInt(st.nextToken());
            single[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(set); Arrays.sort(single);
        result = Math.min((n / 6 + 1) * set[0], n * single[0]);
        result = Math.min(result, (n / 6) * set[0] + (n % 6) * single[0]);
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
