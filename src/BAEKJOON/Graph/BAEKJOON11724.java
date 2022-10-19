package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON11724 {
    private static int[][]map;
    private static boolean[]visit;
    private static int n,m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int count=0;

        map = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            map[start][end]=1;
            map[end][start]=1;
        }
        for (int i=1;i<=n;i++){
            if (!visit[i]){
                bfs(i);
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visit[v]=true;
        while (!queue.isEmpty()){
            int cur=queue.poll();
            for (int i=1;i<=n;i++){
                if(map[cur][i]==1&&!visit[i]){
                    visit[i]=true;
                    queue.offer(i);
                }
            }
        }
    }
}
