package BAEKJOON.Greedy;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BAEKJOON15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<n;i++){
            pq.offer(Long.parseLong(st.nextToken()));
        }
        for (int i=0;i<m;i++){
            long x = pq.poll();
            long y = pq.poll();
            long sum = x + y;
            pq.offer(sum);
            pq.offer(sum);
        }
        long sum = pq.stream().reduce(0L, (n1, n2) -> n1 + n2);
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
