package Programmers.BruteForce;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinRectangle {
    public int solution(int[][] sizes) {

        for(int i=0;i<sizes.length;i++) {
            if(sizes[i][0]<sizes[i][1]) {
                int temp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<sizes.length;i++) {
            pq.offer(sizes[i][0]);
        }
        int width=pq.peek();
        pq.clear();
        for(int i=0;i<sizes.length;i++) {
            pq.offer(sizes[i][1]);
        }
        int height=pq.peek();

        return width*height;
    }
}
