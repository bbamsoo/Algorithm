package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON7576 {
    private static int[][]arr;
    private static int n,m;
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};
    private static Queue<int[]>queue=new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr=new int[m][n];
        for (int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            for (int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(arr[i][j]==1)
                    queue.add(new int[]{i,j});
            }
        }
        bw.write(bfs()+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static int bfs(){
        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    if (arr[nx][ny] == 0) {
                        arr[nx][ny] = arr[x][y] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        int max=Integer.MIN_VALUE;
        if(check()) return -1;
        else{
            for (int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    max = Math.max(max, arr[i][j]);
                }
            }
        }
        return max-1;
    }
    public static boolean check(){
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(arr[i][j]==0){
                    return true;
                }
            }
        }
        return false;
    }
}
