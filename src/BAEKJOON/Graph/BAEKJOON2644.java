package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON2644 {
    private static int[][]map;
    private static int start,end, n;
    private static int[]d;
    private static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];
        d = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
            map[y][x] = 1;
        }
        bfs(start, end);
        if (d[end] == 0) bw.write(-1+"");
        else bw.write(d[end]+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x, int y){
        queue.offer(x);
        while (!queue.isEmpty()){
            int v = queue.poll();
            if(v == y) break;
            for (int i = 1;i <= n;i++){
                if (map[v][i] == 1 && d[i] == 0){
                    d[i] = d[v] + 1;
                    queue.offer(i);
                }
            }
        }
    }
}
