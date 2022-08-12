package Programmers.BruteForce;

import java.util.HashSet;

public class FindPrime {
    static HashSet<Integer> prime = new HashSet<>();
    static StringBuilder sb= new StringBuilder();

    public int solution(String numbers) {
        char[]num=numbers.toCharArray();
        for(int i=1;i<=num.length;i++)
            perm(num,0,num.length,i);
        return prime.size();
    }
    static boolean isPrime(String s) {
        int n = Integer.parseInt(s);

        for(int i=2;i<n;i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    static void perm(char[]arr,int depth,int n,int r) {
        if(depth == r) {
            for (int i = 0; i < r; i++)
                sb.append(arr[i]);
            if(isPrime(sb.toString()) && Integer.parseInt(sb.toString())>=2)
                prime.add(Integer.parseInt(sb.toString()));
            sb.setLength(0);
            return;
        }
        for(int i=depth;i<n;i++) {
            swap(arr,depth,i);
            perm(arr,depth+1,n,r);
            swap(arr,depth,i);
        }
    }
    static void swap(char[]arr,int i, int j) {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
