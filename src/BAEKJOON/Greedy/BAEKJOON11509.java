package BAEKJOON.Greedy;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BAEKJOON11509 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count=0;
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], 0);
        }
        for (int i=0;i<n;i++){
            if (map.get(arr[i])>0){
                map.put(arr[i], map.get(arr[i]) - 1);
            }
            else{
                count++;
            }
            map.put(arr[i] - 1, map.getOrDefault(arr[i] - 1, 0) + 1);
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}