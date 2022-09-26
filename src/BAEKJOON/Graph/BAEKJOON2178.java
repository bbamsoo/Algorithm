package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON2178 {
    static int[][] arr;
    static boolean[][] visited;
    static int N;
    static int M;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0;j<M;j++){
                arr[i][j] = s.charAt(j)-'0';
            }
        }
        visited = new boolean[N][M];
        visited[0][0]=true;
        bfs(0,0);
        bw.write(arr[N-1][M-1]+"");
        bw.flush();
        bw.close();
        br.close();

    }
    public static void bfs(int x,int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()){
            int []now= queue.poll();
            int curX = now[0];
            int curY = now[1];

            for(int i=0;i<4;i++){
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];
                if(nextX<0||nextY<0||nextX>=N||nextY>=M)
                    continue;
                if(visited[nextX][nextY]||arr[nextX][nextY]==0)
                    continue;
                queue.add(new int[]{nextX, nextY});
                arr[nextX][nextY]=arr[curX][curY]+1;
                visited[nextX][nextY]=true;
            }
        }
    }
}
