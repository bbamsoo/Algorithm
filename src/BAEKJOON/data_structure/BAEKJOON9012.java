package BAEKJOON.data_structure;

import java.io.*;

public class BAEKJOON9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int t=0;t<n;t++){
            String s = br.readLine();
            String answer = "";
            int count = 0;
            for (char c:s.toCharArray()){
                if (c == ')') count--;
                else count++;

                if (count<0){
                    answer = "NO";
                    break;
                }
            }
            answer = count==0 ? "YES":"NO";
            bw.write(answer+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}