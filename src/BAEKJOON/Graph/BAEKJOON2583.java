package BAEKJOON.Graph;

import java.io.*;
import java.util.*;

public class BAEKJOON2583 {
    private static int[][]map;
    private static boolean[][]visit;
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};
    private static int row, col;
    private static ArrayList<Integer> result = new ArrayList<>();
    private static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        int triangle = Integer.parseInt(st.nextToken());
        map = new int[row][col];
        visit = new boolean[row][col];

        for (int count=0;count<triangle;count++){
            st = new StringTokenizer(br.readLine(), " ");
            int col_s = Integer.parseInt(st.nextToken());
            int row_e = row-Integer.parseInt(st.nextToken());
            int col_e = Integer.parseInt(st.nextToken());
            int row_s = row - Integer.parseInt(st.nextToken());
            for (int i=row_s;i<row_e;i++){
                for (int j=col_s;j<col_e;j++){
                    map[i][j]=1;
                }
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (!visit[i][j]&&map[i][j]==0){
                    bfs(i,j);
                }
            }
        }
        bw.write(result.size()+"\n");
        Collections.sort(result);
        for (int n:result){
            bw.write(n+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x, int y){
        int count=1;
        queue.offer(new int[]{x, y});
        visit[x][y]=true;
        while (!queue.isEmpty()){
            int cx = queue.peek()[0];
            int cy = queue.peek()[1];
            queue.poll();
            for (int i=0;i<4;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx>=0&&ny>=0&&nx<row&&ny<col){
                    if (!visit[nx][ny]&&map[nx][ny]==0){
                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny]=true;
                        count++;
                    }
                }
            }
        }
        result.add(count);
    }
}
