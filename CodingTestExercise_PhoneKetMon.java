
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> distinctNums = new HashSet<>();
        for(int num : nums){
            distinctNums.add(num);
        }
        
        int pickPocketMonNumber = nums.length / 2;
        int typeNumber = distinctNums.size();

        return Math.min(pickPocketMonNumber, typeNumber);
    }
}
