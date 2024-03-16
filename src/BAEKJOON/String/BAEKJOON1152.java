package BAEKJOON.String;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        bw.write(st.countTokens()+"");
        bw.flush();
        br.close();
        bw.close();

    }
}
