package BAEKJOON.String;

import java.io.*;
import java.util.Stack;

public class BAEKJOON4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            Stack<Character> stack = new Stack<>();

            for (char ch:str.toCharArray()){
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (!stack.isEmpty() && stack.peek().equals('(')){
                        stack.pop();
                    } else stack.push(')');
                } else if (ch == ']') {
                    if (!stack.isEmpty() && stack.peek().equals('[')){
                        stack.pop();
                    } else stack.push(']');
                }
            }
            bw.write(stack.isEmpty() ? "yes\n" : "no\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
