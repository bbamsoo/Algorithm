package BAEKJOON.Sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BAEKJOON10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[][] map = new String[n][2];
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            map[i][0] = st.nextToken();
            map[i][1] = st.nextToken();
        }
        Arrays.sort(map, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });
        for (int i=0;i<n;i++){
            bw.write(map[i][0]+" "+map[i][1]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
