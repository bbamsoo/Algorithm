package BAEKJOON.Greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BAEKJOON1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t=0;t<T;t++){
            int n = Integer.parseInt(br.readLine());
            int count=1;
            int[][] arr = new int[n][2];
            for (int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0]-o2[0];
                }
            });
            int compare = arr[0][1];
            for (int i=1;i<n;i++){
                if (arr[i][1]<compare){
                    compare = arr[i][1];
                    count++;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}