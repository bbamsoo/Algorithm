package BAEKJOON.String;

import java.io.*;

public class BAEKJOON10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] input = new char[5][15];
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<5;i++){
            String str = br.readLine();
            for (int j=0;j<str.length();j++){
                input[i][j] = str.charAt(j);
            }
        }
        for (int i=0;i<input[0].length;i++){
            for (int j=0;j<5;j++){
                if (input[j][i] == '\0'){
                    continue;
                }
                sb.append(input[j][i]);
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
