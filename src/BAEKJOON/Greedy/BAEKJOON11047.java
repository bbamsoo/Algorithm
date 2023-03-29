package BAEKJOON.Greedy;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int count=0;

        int []changes=new int[num];
        for (int i = 0; i < num; i++) {
            changes[i] = Integer.parseInt(br.readLine());
        }
		for(int i=changes.length-1;i>=0;i--) {
            if(money>=changes[i]) {
                count += (money / changes[i]);
                money %= changes[i];
            }
		}
		bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
