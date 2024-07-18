package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Two_sum {

    // This method finds two indices such that the elements at those indices add up to the target
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int negation = target - nums[i];
            if (map.containsKey(negation)) {
                return new int[]{nums[map.get(negation)], nums[i]};
            }
            map.put(nums[i], i);
        }

        return new int[]{}; 
    }

    public static void main(String[] args) {
        int numbers[] = {1, 3, 6, 8};
        int target = 14;

        int result[] = twoSum(numbers, target);
        
        System.out.println(Arrays.toString(result));
        
       
    }
}
