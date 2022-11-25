package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON5014 {
    private static int f, s, g;
    private static int[] dir = new int[2];
    private static int[] move;
    private static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        dir[0] = Integer.parseInt(st.nextToken());
        dir[1] = -Integer.parseInt(st.nextToken());

        move = new int[f + 1];
        check = new boolean[f + 1];

        bw.write(bfs(s)+"");
        bw.flush();
        bw.close();
        br.close();

    }
    public static String bfs(int s){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(s);
        check[s] = true;
        move[s] = 0;
        while (!queue.isEmpty()){
            int cur = queue.poll();
            if (cur == g)
                return move[cur] + "";
            for (int i=0;i<2;i++){
                int next = cur + dir[i];
                if (next<=f&&next>=1){
                    if (!check[next]){
                        check[next] = true;
                        queue.offer(next);
                        move[next] = move[cur] + 1;
                    }
                }
            }
        }
        return "use the stairs";
    }
}