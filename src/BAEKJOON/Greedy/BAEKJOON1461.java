package BAEKJOON.Greedy;

import java.io.*;
import java.util.*;

public class BAEKJOON1461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max=0;
        int result=0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> plus = new LinkedList<>();
        List<Integer> minus = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++){
            int input = Integer.parseInt(st.nextToken());
            max=Math.max(max, Math.abs(input));
            if(input>0) plus.add(input);
            else minus.add(Math.abs(input));
        }
        Collections.sort(plus,Collections.reverseOrder());
        Collections.sort(minus,Collections.reverseOrder());

        while(!plus.isEmpty()){
            result += plus.get(0)*2;
            for (int i=0;i<m;i++){
                if(!plus.isEmpty()){
                    plus.remove(0);
                }
            }
        }
        while(!minus.isEmpty()){
            result += minus.get(0)*2;
            for (int i=0;i<m;i++){
                if(!minus.isEmpty()){
                    minus.remove(0);
                }
            }
        }
        result-=max;
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
