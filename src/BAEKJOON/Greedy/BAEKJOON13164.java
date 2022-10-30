package BAEKJOON.Greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BAEKJOON13164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i=1;i<n;i++){
            list.add(arr[i] - arr[i - 1]);
        }
        Collections.sort(list);
        int result = 0;
        for(int i=0;i<n-k;i++){
            result += list.get(i);
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
