import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] param = bufferedReader.readLine().split(" ");

        N = Integer.parseInt(param[0]);
        M = Integer.parseInt(param[1]);

        List<Integer> coinList = new ArrayList<>();
        for(int i=0; i < N; i++){
            int coin = Integer.parseInt(bufferedReader.readLine());
            if(coin <= M){
                coinList.add(coin);
            }
        }

        Integer[] coins = coinList.toArray(new Integer[0]);

        Arrays.sort(coins);

        int count = 0;
        for(int i=coins.length - 1; i >= 0; i--){
            int share = M / coins[i];
            M = M - (share * coins[i]);
            count += share;
        }

        System.out.println(count);

    }

}
