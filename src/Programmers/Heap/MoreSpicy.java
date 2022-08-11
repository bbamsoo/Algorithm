package Programmers.Heap;

import java.util.PriorityQueue;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int scov:scoville) {
            pq.offer(scov);
        }
        while(pq.peek()<K) {
            if(pq.size() == 1)
                return -1;

            pq.offer(pq.poll()+2*pq.poll());
            answer++;
        }
        return answer;
    }
}
