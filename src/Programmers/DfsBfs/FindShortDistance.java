package Programmers.DfsBfs;

import java.util.LinkedList;
import java.util.Queue;

public class FindShortDistance {
    int []row={-1,0,1,0};
    int []col={0,1,0,-1};

    public int solution(int[][] maps) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                if (maps[i][j] == 0)
                    maps[i][j] = -1;
                if (maps[i][j] == 1)
                    maps[i][j] = Integer.MAX_VALUE;
            }
        }

        queue.offer(new int[]{0,0});
        maps[0][0]=1;
        while(!queue.isEmpty()){
            int[]current= queue.poll();
            int cur_row=current[0];
            int cur_col=current[1];

            for(int i=0;i<4;i++){
                int next_row=cur_row+row[i];
                int next_col=cur_col+col[i];
                if (next_row< maps.length && next_row>=0 && next_col< maps[0].length && next_col>=0 && maps[next_row][next_col]!=-1){
                    if(maps[next_row][next_col]>maps[cur_row][cur_col]+1){
                        maps[next_row][next_col]=maps[cur_row][cur_col]+1;
                        queue.offer(new int[]{next_row,next_col});
                    }
                }
            }
        }

        return maps[maps.length-1][maps[0].length-1] != Integer.MAX_VALUE?maps[maps.length-1][maps[0].length-1]:-1;
    }
}
