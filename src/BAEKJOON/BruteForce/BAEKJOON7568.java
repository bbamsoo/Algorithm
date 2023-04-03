package BAEKJOON.BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] weight = new int[num];
        int[] height = new int[num];

        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0;i<num;i++){
            int rank = 1;
            for (int j=0;j<num;j++){

                if (i == j)
                    continue;
                else if(weight[i]<weight[j] && height[i] < height[j])
                    rank++;
            }
            bw.write(rank+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

