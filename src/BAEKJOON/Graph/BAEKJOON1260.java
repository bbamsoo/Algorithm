package BAEKJOON.Graph;

import java.io.*;
import java.util.*;

public class BAEKJOON1260 {
    public static ArrayList<Integer>[] nodelist;
    public static boolean isVisited[];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        nodelist = new ArrayList[N + 1];
        isVisited = new boolean[N + 1];

        for (int i=1;i<=N;i++){
            nodelist[i] = new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            nodelist[from].add(to);
            nodelist[to].add(from);
        }
        for (int i=1;i<=N;i++){
            Collections.sort(nodelist[i]);
        }
        dfs(V);
        bw.write(sb.toString()+"\n");
        sb.delete(0, sb.length());
        Arrays.fill(isVisited,false);
        bfs(V);
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }
    public static void dfs(int V){
        if(!isVisited[V]){
            isVisited[V]=true;
            sb.append(V).append(" ");
            for (int i=0;i<nodelist[V].size();i++){
                if(!isVisited[nodelist[V].get(i)]){
                    dfs(nodelist[V].get(i));
                }
            }
        }
    }
    public static void bfs(int V){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(V);
        while (!queue.isEmpty()){
            int node=queue.poll();
            if(!isVisited[node]){
                isVisited[node]=true;
                sb.append(node).append(" ");
                for (int i=0;i<nodelist[node].size();i++){
                    if(!isVisited[nodelist[node].get(i)]){
                        queue.offer(nodelist[node].get(i));
                    }
                }
            }
        }
    }
}