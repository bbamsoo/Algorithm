package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON2468 {
    private static int [][]map;
    private static boolean [][]visit;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        int result=0;
        int max=0;
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j=0;j<n;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
                max=Math.max(max,map[i][j]);
            }
        }
        for(int height=0;height<=max;height++) {
            visit = new boolean[n][n];
            int count=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visit[i][j] && map[i][j] > height) {
                        count++;
                        bfs(i, j,height);
                    }
                }
            }
            result=Math.max(count,result);
        }
        bw.write(result+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x,int y,int height){
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visit[x][y]=true;
        while (!queue.isEmpty()){
            int cx=queue.peek()[0];
            int cy=queue.peek()[1];
            queue.poll();
            for (int i=0;i<4;i++){
                int nx=cx+dx[i];
                int ny=cy+dy[i];
                if (nx>=0&&ny>=0&&nx<n&&ny<n){
                    if (!visit[nx][ny]&&map[nx][ny]>height){
                        visit[nx][ny]=true;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }
}
