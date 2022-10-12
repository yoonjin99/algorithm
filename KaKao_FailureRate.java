
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        Arrays.sort(stages);

        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for(int key : stages){
            counts.put(key, counts.getOrDefault(key, 0) + 1);
        }

        Map<Integer, Double> failureRate = new LinkedHashMap<>();
        for(int i=0; i < N; i++){
            int k = 0;
            for(int a : stages){
                if(a < i + 1){
                    k++;
                }
            }
            if(counts.containsKey(i+1)){
                failureRate.put(i+1 , Double.valueOf(counts.getOrDefault(i+1,0)) / Double.valueOf(stages.length - k));
            }else{
                failureRate.put(i+1 , 0.0);
            }
        }

        List<Integer> failureRateDesc = new ArrayList<>(failureRate.keySet());
        Collections.sort(failureRateDesc, (rate1, rate2) -> (failureRate.get(rate2).compareTo(failureRate.get(rate1))));

        int[] answer = new int[N];
        for(int i=0; i < N; i++){
            answer[i] = failureRateDesc.get(i);
        }
        return answer;
    }
}
