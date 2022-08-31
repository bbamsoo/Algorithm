package BAEKJOON;

import java.util.Scanner;

public class BAEKJOON2798 {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int sum = sc.nextInt();

        int []card= new int[count];

        for(int i=0;i<card.length;i++){
            card[i] = sc.nextInt();
        }
        System.out.println(search(card,count,sum));

    }
}

