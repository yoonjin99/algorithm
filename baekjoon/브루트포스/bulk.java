package com.company;

import java.io.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int[][] bulks = new int[num][num];
        for(int i=0; i < num; i++){
            String[] bulk = bufferedReader.readLine().split(" ");
            bulks[i][0] = Integer.parseInt(bulk[0]);
            bulks[i][1] = Integer.parseInt(bulk[1]);
        }

        int[] grades = IntStream.range(0, num).map(i -> 1).toArray();

        for(int i=0; i < num; i++){
            for(int j=0; j < num; j++){
                if(bulks[i][0] < bulks[j][0] && bulks[i][1] < bulks[j][1]){
                    grades[i] += 1;
                }
            }
        }

        for(int grade : grades){
            System.out.print(grade + " ");
        }
    }
}
