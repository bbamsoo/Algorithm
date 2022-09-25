package BAEKJOON.Sorting;

import java.io.*;
import java.util.PriorityQueue;

public class BAEKJOON2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<N;i++){
            pq.offer(Integer.parseInt(br.readLine()));
        }
        while(!pq.isEmpty()){
            bw.write(pq.poll()+""+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
