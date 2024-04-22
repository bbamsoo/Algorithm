package BAEKJOON.String;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<t;i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            while (st.hasMoreTokens()){
                StringBuilder sb2 = new StringBuilder(st.nextToken());
                sb.append(sb2.reverse()).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
