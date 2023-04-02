package BAEKJOON.BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON1182 {

    private static int n, s, ans = 0;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0);
        ans = s == 0 ? ans - 1 : ans;
        bw.write(ans+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void dfs(int depth, int sum){
        if (depth == n){
            if (sum == s)
                ans++;
            return;
        }
        dfs(depth + 1, sum + arr[depth]);
        dfs(depth + 1, sum);
    }
}
