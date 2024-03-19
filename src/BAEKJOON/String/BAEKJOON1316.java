package BAEKJOON.String;

import java.io.*;

public class BAEKJOON1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0;i<n;i++){
            if (check(br.readLine())) {
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
    static boolean check(String str){
        boolean[] check = new boolean[26];
        int prev = 0;
        for (int i=0;i<str.length();i++){
            int now = str.charAt(i);
            if (prev != now){
                if (!check[now-'a']){
                    check[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
            else {
                continue;
            }
        }
        return true;
    }
}
