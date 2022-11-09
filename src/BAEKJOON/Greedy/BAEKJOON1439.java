package BAEKJOON.Greedy;

import java.io.*;

public class BAEKJOON1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int zeroArea=0, oneArea=0;
        char status = s.charAt(0);
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)!=status){
                if (status=='0'){
                    zeroArea++;
                }
                else if (status=='1'){
                    oneArea++;
                }
                status = s.charAt(i);
            }
        }
        if (status=='0'){
            zeroArea++;
        }
        else if (status=='1'){
            oneArea++;
        }
        bw.write(Math.min(zeroArea,oneArea)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
