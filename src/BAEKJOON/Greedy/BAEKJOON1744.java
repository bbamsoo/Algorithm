package BAEKJOON.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BAEKJOON1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minus = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int sum=0;

        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int num= Integer.parseInt(st.nextToken());
            if(num>0)  plus.add(num);
            else minus.add(num);
        }
        while(!plus.isEmpty()){
            int temp=plus.poll();
            if(!plus.isEmpty()) {
                int next = plus.peek();
                temp = (temp * next) > temp ? temp * plus.poll() : temp;
            }
            sum+=temp;
        }
        while(!minus.isEmpty()){
            int temp=minus.poll();
            if(!minus.isEmpty()) {
                int next = minus.peek();
                temp = (temp * next) > temp ? temp * minus.poll() : temp;
            }
            sum+=temp;
        }

        System.out.println(sum);
    }
}
