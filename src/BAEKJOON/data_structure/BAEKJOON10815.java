package BAEKJOON.data_structure;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i=0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());

            bw.write(binarySearch(num,arr,n)+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static int binarySearch(int num, int[] arr, int n){
        int left = 0, right = n-1;

        while (left <= right){
            int middle = (left + right) / 2;

            if (num > arr[middle]){
                left = middle + 1;
            } else if (num < arr[middle]) {
                right = middle - 1;
            } else return 1;
        }
        return 0;
    }
}
