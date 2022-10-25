package BAEKJOON.Graph;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BAEKJOON10026 {
    private static char[][]map;
    private static boolean[][]visit;
    private static int n;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        visit = new boolean[n][n];
        int count1=0, count2=0;

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for (int j=0;j<n;j++){
                map[i][j]=s.charAt(j);
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (!visit[i][j]) {
                    bfs(i, j, map[i][j]);
                    count1++;
                }
            }
        }
        for (int i=0;i<n;i++){
            Arrays.fill(visit[i],false);
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (map[i][j]=='G') {
                    map[i][j]='R';
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (!visit[i][j]) {
                    bfs(i, j, map[i][j]);
                    count2++;
                }
            }
        }
        bw.write(count1+" "+count2);
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x, int y,char color){
        queue.offer(new int[]{x, y});
        visit[x][y]=true;
        while (!queue.isEmpty()){
            int cx = queue.peek()[0];
            int cy = queue.peek()[1];
            queue.poll();
            for (int i=0;i<4;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx>=0&&ny>=0&&nx<n&&ny<n){
                    if (!visit[nx][ny]&&map[nx][ny]==color){
                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                    }
                }
            }
        }
    }
}
