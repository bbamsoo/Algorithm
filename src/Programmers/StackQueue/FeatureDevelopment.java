package Programmers.StackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FeatureDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<progresses.length;i++) {
            double remain = (100-progresses[i])/(double)speeds[i];
            int date = (int)Math.ceil(remain);

            if(!queue.isEmpty() && queue.peek() < date) {
                ans.add(queue.size());
                queue.clear();
            }
            queue.offer(date);
        }
        ans.add(queue.size());

        int [] answer= new int[ans.size()];
        for(int i=0;i<answer.length;i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
