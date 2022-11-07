package BAEKJOON.Sorting;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON1920 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<m;i++){
            bw.write(binarySearch(Integer.parseInt(st.nextToken()),a)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static int binarySearch(int n,int []a){
        int left = 0;
        int right = a.length-1;
        while (left<=right){
            int mid = (left + right) / 2;
            if (a[mid]==n) return 1;
            else if (a[mid]>n) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return 0;
    }
}
