package BAEKJOON.Graph;

import java.io.*;
import java.util.*;

public class BAEKJOON2606 {
    private static boolean visited[];
    private static ArrayList<Integer>[] nodelist;
    private static ArrayList<Integer> arr;
    private static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        nodelist = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i=1;i<=N;i++){
            nodelist[i] = new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            nodelist[from].add(to);
            nodelist[to].add(from);
        }
        for (int i=1;i<=N;i++){
            Collections.sort(nodelist[i]);
        }
        bfs(1);
        bw.write(arr.size()-1+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int v){
        arr = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while(!queue.isEmpty()){
            int node= queue.poll();
            if(!visited[node]){
                visited[node]=true;
                arr.add(node);
                for(int i=0;i<nodelist[node].size();i++){
                    if(!visited[nodelist[node].get(i)]){
                        queue.offer(nodelist[node].get(i));
                    }
                }
            }
        }
    }
}
