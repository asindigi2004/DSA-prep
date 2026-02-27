import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[]args){
        int [] nums = {1,2,3,4};
        int target = 7;
        int[] result = twoSum(nums,target);
        //System.out.println(result); this gives error as Java printing the object reference, not the contents of your array.
        System.out.println(Arrays.toString(result)); 
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(seen.containsKey(diff))return new int[]{seen.get(diff),i};
            seen.put(num,i);
        }
        return new int[]{};
    }
}
