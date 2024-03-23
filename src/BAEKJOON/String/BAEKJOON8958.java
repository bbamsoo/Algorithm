package BAEKJOON.String;

import java.io.*;

public class BAEKJOON8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<t;i++){
            String str = br.readLine();
            int score = 0, count = 0;
            for (int j=0;j<str.length();j++){
                if (str.charAt(j) == 'O'){
                    count++;
                    score += count;
                } else if (str.charAt(j)=='X') {
                    count = 0;
                }
            }
            sb.append(score).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}