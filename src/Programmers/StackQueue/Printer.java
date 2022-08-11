package Programmers.StackQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:priorities) {
            pq.offer(i);
        }
        while(!pq.isEmpty()) {
            for(int i=0;i<priorities.length;i++) {
                if(pq.peek() == priorities[i]) {
                    if(i == location) {
                        return answer;
                    }
                    answer++;
                    pq.poll();
                }
            }
        }
        return answer;
    }
}
