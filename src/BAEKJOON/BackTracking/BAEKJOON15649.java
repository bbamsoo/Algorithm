package BAEKJOON.BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BAEKJOON15649 {
    static int N, M;
    static int[] arr;
    static boolean[] isUsed;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        isUsed = new boolean[N + 1];
        arr = new int[M + 1];

        recursion(0);
    }

    private static void recursion(int idx) {
        if (idx == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                arr[idx] = i;
                recursion(idx + 1);
                isUsed[i] = false;
            }
        }
    }
}