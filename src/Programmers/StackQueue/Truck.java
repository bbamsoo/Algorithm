package Programmers.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time =0;
        int sum=0;
        Queue<Integer> queue = new LinkedList<>();

        for(int truck : truck_weights) {
            while(true) {
                if(queue.isEmpty()) {
                    queue.add(truck);
                    sum+=truck;
                    time++;
                    break;
                }
                else if(queue.size() == bridge_length) {
                    int finish = queue.poll();
                    sum-=finish;
                    time++;
                    if(sum+truck<=weight) {
                        queue.add(truck);
                        sum+=truck;
                        break;
                    }
                    else {
                        queue.add(0);
                    }
                }
                else {
                    time++;
                    if(sum+truck<=weight) {
                        queue.add(truck);
                        sum+=truck;
                        break;
                    }
                    else {
                        queue.add(0);
                    }
                }
            }
        }
        return time+bridge_length;
    }
}
