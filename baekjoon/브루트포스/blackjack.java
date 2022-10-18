package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] num = bufferedReader.readLine().split(" ");

        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        String[] card = bufferedReader.readLine().split(" ");
        int[] cardNums = new int[n];
        for(int i=0; i < n; i++){
            cardNums[i] = Integer.parseInt(card[i]);
        }

        int sum = 0;
        int temp = 0;
        for(int i=0; i < cardNums.length; i++){
            for(int j=i+1; j < cardNums.length; j++){
                for(int k=j+1; k < cardNums.length; k++){
                    sum = cardNums[i] + cardNums[j] + cardNums[k];
                    if(sum > temp && sum <= m){
                        temp = sum;
                    }
                }
            }
            sum = 0;
        }

        System.out.println(temp);

    }
}

