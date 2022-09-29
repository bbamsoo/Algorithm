package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON1012 {
    private static int[][]arr;
    private static boolean[][]visited;
    private static int n,m;
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int num=0;num<t;num++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            arr = new int[m][n];
            visited = new boolean[m][n];
            int count=0;

            for(int i=0;i<k;i++){
                st = new StringTokenizer(br.readLine(), " ");
                int row = Integer.parseInt(st.nextToken());
                int col = Integer.parseInt(st.nextToken());
                arr[row][col]=1;
            }
            for (int i=0;i<m;i++){
                for (int j=0;j<n;j++){
                    if (!visited[i][j]&&arr[i][j]==1) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y]=true;

        while(!queue.isEmpty()){
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];

            queue.poll();
            for (int i=0;i<4;i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                if(nx>=0&&ny>=0&&nx<m&&ny<n){
                    if(!visited[nx][ny]&&arr[nx][ny]==1){
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny]=true;
                    }
                }
            }
        }
    }
}