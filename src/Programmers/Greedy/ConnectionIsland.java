package Programmers.Greedy;

import java.util.Arrays;

public class ConnectionIsland {
    static int[] parents;

    public static void main(String[] args) {
        int[][] costs = {{0, 1, 1}, {0, 2, 2}, {1, 3, 1}, {2, 3, 8}};
        System.out.println(solution(4,costs));
    }
    public static int solution(int n, int[][] costs) {
        int answer = 0;
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);


        parents = new int[n];
        for (int i=0;i< parents.length;i++){
            parents[i] = i;
        }
        for (int []arr:costs){
            int from = arr[0];
            int to = arr[1];
            int cost = arr[2];

            if (unionFind(from) == unionFind(to)) continue;

            answer += cost;
            parents[unionFind(to)] = unionFind(from);
        }

        return answer;
    }
    public static int unionFind(int node){
        if (parents[node] == node) return parents[node];
        return unionFind(parents[node]);
    }

}
