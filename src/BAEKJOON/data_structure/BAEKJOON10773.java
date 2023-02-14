package BAEKJOON.data_structure;

import java.io.*;
import java.util.Stack;

public class BAEKJOON10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<k;i++){
            int input = Integer.parseInt(br.readLine());
            if (!stack.isEmpty() && input == 0)
                stack.pop();
            else
                stack.push(input);
        }
        bw.write(stack.stream().reduce(0, Integer::sum)+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}