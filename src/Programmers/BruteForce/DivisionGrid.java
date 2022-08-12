package Programmers.BruteForce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DivisionGrid {
    List<Integer>[] list;
    boolean visited[];

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        list = new List[n+1];
        for(int i=0;i<=n;i++) {
            list[i]=new ArrayList<>();
        }
        for(int[]wire:wires) {
            list[wire[0]].add(wire[1]);
            list[wire[1]].add(wire[0]);
        }
        for(int[]wire:wires) {
            int a=bfs(wire[0],wire[1],n);
            int b=bfs(wire[1],wire[0],n);

            answer = Math.min(answer,Math.abs(a-b));
        }

        return answer;
    }
    int bfs(int v1, int v2, int n) {
        Queue<Integer> queue=new LinkedList<Integer>();
        visited = new boolean[n+1];

        int count=0;
        queue.offer(v1);
        visited[v1]=true;

        while(!queue.isEmpty()) {
            int poll = queue.poll();
            count++;

            for(int next:list[poll]) {
                if(next != v2 && !visited[next]) {
                    queue.add(next);
                    visited[next]=true;
                }
            }
        }

        return count;
    }
}
