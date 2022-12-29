package BAEKJOON.Graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAEKJOON7562 {
    static int t, l;
    static int[][] map;
    static boolean[][] visit;
    static Point start, end;
    static int[][] dir = {{-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}};
    private static LinkedList<Integer> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            l = Integer.parseInt(br.readLine());
            map = new int[l][l];
            visit = new boolean[l][l];

            st = new StringTokenizer(br.readLine());
            start = new Point(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()), 0);
            st = new StringTokenizer(br.readLine());
            end = new Point(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()), 0);

            bfs(start);
        }
        for (int r:result)
            System.out.println(r);
    }
    static void bfs(Point p) {
        Queue<Point> q = new LinkedList<>();
        q.add(p);
        visit[p.row][p.col] = true;

        while(!q.isEmpty()) {
            Point temp = q.poll();
            int tempR = temp.row;
            int tempC = temp.col;
            int cnt = temp.cnt;

            if(tempR == end.row && tempC == end.col) {
                result.add(temp.cnt);
                return;
            }

            for(int i = 0; i < 8; i++) {
                int nr = tempR + dir[i][0];
                int nc = tempC + dir[i][1];

                if(nr >= 0 && nr < l && nc >= 0 && nc < l && !visit[nr][nc]) {
                    q.add(new Point(nr, nc, cnt + 1));
                    visit[nr][nc] = true;
                }
            }
        }
    }

    static class Point {
        int row, col, cnt;

        public Point(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }
}