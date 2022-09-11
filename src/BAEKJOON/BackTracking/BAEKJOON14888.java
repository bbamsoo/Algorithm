package BAEKJOON.BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON14888 {
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    static int count;
    static int[] arr;
    static int [] op= new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        count = Integer.parseInt(br.readLine());
        arr = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<count;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<4;i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }
        dfs(arr[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }
    public static void dfs(int num, int idx) {
        if (idx == count) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {
                op[i]--;
                switch (i) {
                    case 0:	dfs(num + arr[idx], idx + 1);	break;
                    case 1:	dfs(num - arr[idx], idx + 1);	break;
                    case 2:	dfs(num * arr[idx], idx + 1);	break;
                    case 3:	dfs(num / arr[idx], idx + 1);	break;
                }
                op[i]++;
            }
        }
    }
}
