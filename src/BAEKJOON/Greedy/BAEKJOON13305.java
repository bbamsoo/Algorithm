package BAEKJOON.Greedy;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BAEKJOON13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        BigInteger[]cost=new BigInteger[N];
        BigInteger []edge=new BigInteger[N-1];
        for(int i=0;i< N-1;i++)
            edge[i]=new BigInteger(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i< N;i++)
            cost[i]=new BigInteger(st.nextToken());
        BigInteger sum=cost[0].multiply(edge[0]);
        int state=0;
        for (int i=1;i<N-1;i++){
            if (cost[i].compareTo(cost[state])>0){
                sum=sum.add(edge[i].multiply(cost[state]));
            }
            else{
                sum=sum.add(edge[i].multiply(cost[i]));
                state=i;
            }
        }
        System.out.println(sum);
        br.close();
    }
}
