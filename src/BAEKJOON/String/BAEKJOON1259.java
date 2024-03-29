package BAEKJOON.String;

import java.io.*;

public class BAEKJOON1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String str = br.readLine();
            if (str.equals("0"))
                break;
            StringBuilder sb = new StringBuilder(str);
            String reverse = sb.reverse().toString();

            bw.write(str.equals(reverse)? "yes\n":"no\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
