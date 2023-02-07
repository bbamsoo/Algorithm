package BAEKJOON.data_structure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAKEJOON10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int last = 0;
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                last = Integer.parseInt(st.nextToken());
                queue.offer(last);
            }

            if (s.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(queue.poll() + "\n");
                }
            }

            if (s.equals("size")) bw.write(queue.size() + "\n");

            if (s.equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            }

            if (s.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(queue.peek() + "\n");
                }
            }
            if (s.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(last + "\n");
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}