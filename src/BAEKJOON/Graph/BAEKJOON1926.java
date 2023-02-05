package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON1926 {
    private static int n, m, count = 0, max = 0;
    private static int map[][];
    private static boolean visit[][];
    private static int[][] dir = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    private static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];

        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine()," ");
            for (int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (!visit[i][j]&&map[i][j]==1){
                    count++;
                    bfs(i, j);
                }
            }
        }
        bw.write(count+"\n"+max);
        bw.flush();
        br.close();
        bw.close();
    }
    public static void bfs(int r, int c){
        queue.offer(new int[]{r, c});
        visit[r][c] = true;
        int size=0;

        while (!queue.isEmpty()){
            int cr = queue.peek()[0];
            int cc = queue.peek()[1];
            queue.poll();
            size++;
            for (int i=0;i<4;i++){
                int nr = cr + dir[i][0];
                int nc = cc + dir[i][1];
                if (nr>=0&&nc>=0&&nr<n&&nc<m&&!visit[nr][nc]&&map[nr][nc]==1){
                    queue.offer(new int[]{nr, nc});
                    visit[nr][nc] = true;
                }
            }
        }
        max = Math.max(max, size);
    }
}
