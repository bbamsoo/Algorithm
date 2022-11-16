package BAEKJOON.Sorting;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BAEKJOON10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<3;i++){
            pq.offer(Integer.parseInt(st.nextToken()));
        }
        pq.poll();
        bw.write(pq.poll() + "");
        bw.flush();
        bw.close();
        br.close();
    }
}