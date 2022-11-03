package BAEKJOON.Sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BAEKJOON1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] s = br.readLine().toCharArray();
        Arrays.sort(s);

        for (int i=s.length-1;i>=0;i--){
            bw.write(s[i] + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}