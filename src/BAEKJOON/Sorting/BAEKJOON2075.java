package BAEKJOON.Sorting;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BAEKJOON2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0;j<n;j++){
                pq.offer(Integer.parseInt(st.nextToken()));
            }
        }
        for (int i=0;i<n-1;i++){
            pq.poll();
        }
        bw.write(pq.poll()+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
