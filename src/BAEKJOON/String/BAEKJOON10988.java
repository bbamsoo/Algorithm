package BAEKJOON.String;

import java.io.*;

public class BAEKJOON10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        bw.write(str.equals(reverse) ? '1' : '0');
        bw.flush();
        bw.close();
        br.close();
    }
}
