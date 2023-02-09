package Programmers.Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class MultiPriorityQueue {
    public static void main(String[] args) {
        String[] operations = new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        for (int val:solution(operations))
            System.out.print(val+" ");
    }
    public static int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String op:operations){
            StringTokenizer st = new StringTokenizer(op," ");
            String opType = st.nextToken();
            int value = Integer.parseInt(st.nextToken());

            if (opType.equals("D")){
                if (minPq.isEmpty()) continue;
                else if (value < 0) {
                    int min = minPq.poll();
                    maxPq.remove(min);
                }
                else{
                    int max = maxPq.poll();
                    minPq.remove(max);
                }
            }
            else{
                minPq.offer(value);
                maxPq.offer(value);
            }
        }
        if (!minPq.isEmpty()){
            answer[0] = maxPq.peek();
            answer[1] = minPq.peek();
        }
        return answer;
    }
}
