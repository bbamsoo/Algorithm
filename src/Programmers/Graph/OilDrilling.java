package Programmers.Graph;

import java.util.*;

public class OilDrilling {
    static int n, m;
    static int[] oil;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        int[][] land1 =
                {{0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 1, 1}};
        int[][] land2 =
                {{1, 0, 1, 0, 1, 1},
                {1, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1}};

        System.out.println(solution(land1));
    }
    public static int solution(int[][] land) {
        int answer = 0;
        n = land.length;
        m = land[0].length;
        oil = new int[m];
        visited = new boolean[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (land[i][j] == 1 && visited[i][j] == false){
                    bfs(land, i, j);
                }
            }
        }
        answer = Arrays.stream(oil).max().getAsInt();
        return answer;
    }
    public static void bfs(int[][] land, int r, int c){
        queue.add(new int[]{r, c});
        visited[r][c] = true;
        int count = 1;
        Set<Integer> set = new HashSet<>();

        while (!queue.isEmpty()){
            int cr = queue.peek()[0];
            int cc = queue.peek()[1];
            set.add(cc);
            queue.poll();
            for (int i=0;i<4;i++){
                int nr = cr + dr[i];
                int nc = cc + dc[i];
                if (nr>=0&&nc>=0&&nr<n&&nc<m){
                    if (land[nr][nc]==1&&!visited[nr][nc]){
                        queue.add(new int[]{nr, nc});
                        visited[nr][nc] = true;
                        count++;
                    }
                }
            }
            for (int i:set){
                oil[i] += count;
            }
        }
    }
}
