package BAEKJOON.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BAEKJOON1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int sum=0;

        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            pq.add(Integer.parseInt(st.nextToken()));
        }
        while(pq.size()>1){
            int num1=pq.poll();
            int num2= pq.poll();
            sum+=num1+num2;
            pq.add(num1+num2);
        }
        System.out.println(sum);
    }
}
