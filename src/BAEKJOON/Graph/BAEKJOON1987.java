package BAEKJOON.Graph;

import java.io.*;
import java.util.*;

public class BAEKJOON1987 {
    private static int[][] map;
    private static boolean[] visit = new boolean[26];
    private static int[] dr = {-1, 1, 0, 0};
    private static int[] dc = {0, 0, -1, 1};
    private static int r, c;
    private static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new int[r][c];
        for (int i=0;i<r;i++){
            String s= br.readLine();
            for (int j=0;j<c;j++){
                map[i][j] = s.charAt(j)-'A';
            }
        }
        dfs(0, 0,0);
        bw.write(max+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void dfs(int row, int col, int count){
        if (visit[map[row][col]]){
            max = Math.max(max, count);
            return;
        }
        else{
            visit[map[row][col]] = true;
            for (int i=0;i<4;i++){
                int cr = row + dr[i];
                int cc = col + dc[i];

                if (cr>=0&&cc>=0&&cr<r&&cc<c){
                    dfs(cr,cc,count+1);
                }
            }
            visit[map[row][col]] = false;
        }
    }
}