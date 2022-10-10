package BAEKJOON.Graph;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON4963 {
    private static int[][] map;
    private static boolean[][] visit;
    private static int dx[] = {-1,-1,-1,0,1,1,1,0};
    private static int dy[] = {-1,0,1,1,1,0,-1,-1};
    private static int w,h;
    private static StringTokenizer st;
    private static ArrayList<Integer> result = new ArrayList<>();
    private static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w==0&&h==0) break;
            map = new int[h][w];
            visit = new boolean[h][w];
            for (int i=0;i<h;i++){
                st = new StringTokenizer(br.readLine(), " ");
                for (int j=0;j<w;j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int count=0;
            for (int i=0;i<h;i++){
                for (int j=0;j<w;j++){
                    if (!visit[i][j]&&map[i][j]==1){
                        count++;
                        bfs(i,j);
                    }
                }
            }
            result.add(count);
        }
        for (int num:result){
            bw.write(num+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x, int y){
        queue.offer(new int[]{x, y});
        visit[x][y]=true;
        while (!queue.isEmpty()){
            int cx = queue.peek()[0];
            int cy = queue.peek()[1];
            queue.poll();
            for (int i=0;i<8;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx>=0&&ny>=0&&nx<h&&ny<w){
                    if (map[nx][ny]==1&&!visit[nx][ny]){
                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny]=true;
                    }
                }
            }
        }
    }
}
