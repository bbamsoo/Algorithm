package BAEKJOON.String;

import java.io.*;

public class BAEKJOON10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        int[] arr = new int[26];

        for (int i=0;i<arr.length;i++){
            arr[i] = -1;
        }
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (arr[c-'a'] == -1){
                arr[c - 'a'] = i;
            }
        }
        for (int i:arr){
            bw.write(i+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}