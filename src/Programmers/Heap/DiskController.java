package Programmers.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DiskController {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
    }
    public static int solution(int[][] jobs) {
        int answer = 0;
        int count = 0;
        int now = 0;
        int index = 0;

        Arrays.sort(jobs, ((o1, o2) -> o1[0] - o2[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        while (count< jobs.length){
            while (index< jobs.length && jobs[index][0]<=now){
                pq.offer(jobs[index++]);
            }
            if (pq.isEmpty()){
                now = jobs[index][0];
            }
            else{
                int[]temp = pq.poll();
                answer += temp[1] + now - temp[0];
                now += temp[1];
                count++;
            }
        }
        return answer/ jobs.length;
    }
}
