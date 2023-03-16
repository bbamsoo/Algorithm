package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON9372 {
    private static int n, m, ans;
    private static boolean visit[];
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            ans = 0;
            arr = new int[n + 1][n + 1];
            visit = new boolean[n + 1];
            for (int j=0;j<m;j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
                arr[b][a] = 1;
            }
            bfs();
            bw.write(ans-1+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    private static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;

        while (!queue.isEmpty()){
            ans++;
            int temp = queue.poll();
            for (int i=1;i<=n;i++){
                if (arr[temp][i]!=0 && !visit[i]){
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
