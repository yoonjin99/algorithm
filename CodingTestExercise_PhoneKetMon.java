
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int pickPocketMonNumber = nums.length / 2;

        HashSet<Integer> distinctNums = new HashSet<>();
        for(int num : nums){
            distinctNums.add(num);
        }

        int typeNumber = distinctNums.size();

        if(pickPocketMonNumber > typeNumber){
            return typeNumber;
        }else{
            return pickPocketMonNumber;
        }
    }
}
