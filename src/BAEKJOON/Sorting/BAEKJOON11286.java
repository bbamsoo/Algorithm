package BAEKJOON.Sorting;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BAEKJOON11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1), abs2 = Math.abs(o2);
                if(abs1==abs2)
                    return o1 > o2 ? 1 : -1;
                return abs1 - abs2;
            }
        });
        for (int i=0;i<n;i++){
            int input = Integer.parseInt(br.readLine());
            if (input==0){
                if (pq.isEmpty())
                    bw.write(0+"\n");
                else
                    bw.write(pq.poll()+"\n");
            }
            else
                pq.offer(input);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}