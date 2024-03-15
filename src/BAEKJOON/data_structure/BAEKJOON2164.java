package BAEKJOON.data_structure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BAEKJOON2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i=1;i<=n;i++){
            queue.add(i);
        }

        while (queue.size()>1){
            queue.poll();
            queue.offer(queue.poll());
        }
        bw.write(queue.poll()+"\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
