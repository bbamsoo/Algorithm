package BAEKJOON.BruteForce;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BACKJOON2798 {
    static int search(int[] card, int count, int sum){
        int result = 0;
        int temp = 0;
        for(int i=0;i<card.length-2;i++){
            for (int j=i+1;j<card.length-1;j++){
                for (int k=j+1;k<card.length;k++){
                    temp = card[i]+card[j]+card[k];

                    if (sum == temp)
                        return temp;
                    if(temp < sum && result <temp)
                        result = temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());

        int []card= new int[count];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<card.length;i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(search(card,count,sum)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}

