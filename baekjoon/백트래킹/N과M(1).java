package com.company;

import java.io.*;

public class Main {
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] param = bufferedReader.readLine().split(" ");

        int num = Integer.parseInt(param[0]);
        int size = Integer.parseInt(param[1]);

        arr = new int[size];
        visit = new boolean[num];

        backtracking(num, size, 0);
    }

    public static void backtracking(int num, int size, int depth){
        // 재귀 깊이가 size와 같아지면 탐색과정에서 담았던 배열 출력
        if(depth == size){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i < num; i++){ // ex) num =  3, size = 1
            // 해당 노드를 방문하지 않았다면?
            if(!visit[i]){
                visit[i] = true; // 해당 노드를 방문상태로 변경
                arr[depth] = i + 1; // 해당 깊이를 인덱스로 하여 i+1값 저장
                backtracking(num, size, depth + 1); // 다음 자식 노드 방문을 위해 depth 1증가시키면서 재귀 호출
                visit[i] = false;
                // 자식 노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
            }
        }
        return;
    }
}


// 참고 사이트 : https://st-lab.tistory.com/114
