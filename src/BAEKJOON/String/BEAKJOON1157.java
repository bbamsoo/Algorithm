package BAEKJOON.String;

import java.io.*;

public class BEAKJOON1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alpha = new int[26];
        String str = br.readLine();
        str = str.toUpperCase();
        for (int i=0;i<str.length();i++){
            alpha[str.charAt(i)-'A']++;
        }
        int max = Integer.MIN_VALUE;
        char ch = '?';
        for (int i=0;i<26;i++){
            if (alpha[i]>max){
                max = alpha[i];
                ch = (char)(i + 'A');
            }
            else if(alpha[i] == max){
                ch = '?';
            }
        }
        bw.write(ch);
        bw.flush();
        bw.close();
        br.close();
    }
}
