package BAEKJOON.Graph;

import java.io.*;
import java.util.*;

public class BAEKJOON2667 {
    private static int [][]arr;
    private static boolean[][] visited;
    private static ArrayList<Integer> result;
    private static int count;
    private static int n;
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        arr=new int[n][n];
        visited = new boolean[n][n];
        result=new ArrayList<>();

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for (int j=0;j<n;j++){
                arr[i][j]=s.charAt(j)-'0';
            }
        }

        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(!visited[i][j]&&arr[i][j]==1){
                    count=1;
                    bfs(i,j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        bw.write(result.size()+"\n");
        for(int num:result){
            bw.write(num+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
    public static void bfs(int x,int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        count++;
                    }
                }
            }
        }
    }
    public static void dfs(int x,int y){
        visited[x][y]=true;
        for (int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx,ny);
                    count++;
                }
            }
        }
    }
}
