package com.company;

import java.io.*;

public class Main {
    public static int[] arr;
    public static int N;
    public static int M;
    static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] param = bufferedReader.readLine().split(" ");

        N = Integer.parseInt(param[0]);
        M = Integer.parseInt(param[1]);

        arr = new int[M];

        backtracking(1,0);

        bufferedWriter.close();
    }

    public static void backtracking(int start, int depth) throws IOException {
        if(depth == M) {
            for (int val : arr) {
                bufferedWriter.write(val + " ");
            }
            bufferedWriter.newLine();
            return;
        }

        for(int i=start; i <= N; i++){
            arr[depth] = i;
            backtracking(i, depth + 1);
        }
    }

}
