import java.util.HashSet;
import java.util.Set;

public class Solution{
    public static void main(String [] args){
        int [] nums = {1,2,3};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
     //You don’t specify the type when calling method.
    }

    private static boolean containsDuplicate(int[] nums) {
        //You are calling the method inside main, which is static. So containsDuplicate must also be static.
        Set<Integer> seen = new HashSet<>();
        for(int num:nums){
            if(seen.contains(num))return true;
            seen.add(num);
        }
        return false;
    }
}