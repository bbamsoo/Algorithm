package BAEKJOON.String;

import java.io.*;
import java.util.*;

public class BAEKJOON1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            map.put(br.readLine(), 1);
        }
        for (int i=0;i<m;i++){
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
            if (map.get(str) == 2){
                list.add(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for (String str:list){
            sb.append(str).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
