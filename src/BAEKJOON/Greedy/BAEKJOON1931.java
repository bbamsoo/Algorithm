package BAEKJOON.Greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BAEKJOON1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });
        int count=0;
        int current=0;
        for (int i=0;i<N;i++){
            if(current<=time[i][0]){
                current=time[i][1];
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}

