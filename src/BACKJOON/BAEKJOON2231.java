package BACKJOON;

import java.util.Scanner;

public class BAEKJOON2231 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int result = 0;

        for(int i = 0; i < input; i++) {
            int num = i;
            int sum = 0;

            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if(sum + i == input) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
