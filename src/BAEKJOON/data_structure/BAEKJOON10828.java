package BAEKJOON.data_structure;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BAEKJOON10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) stack.push(Integer.parseInt(st.nextToken()));

            if (s.equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            }

            if (s.equals("size")) bw.write(stack.size() + "\n");

            if (s.equals("empty")) {
                if (stack.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            }

            if (s.equals("top")) {
                if (stack.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}