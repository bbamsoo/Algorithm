package BAEKJOON.String;

import java.io.*;

public class BAEKJOON2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();

        for (int i=0;i<croatia.length;i++){
            if (str.contains(croatia[i])){
                str = str.replace(croatia[i], "!");
            }
        }
        bw.write(str.length()+"");
        bw.flush();
        br.close();
        bw.close();
    }
}