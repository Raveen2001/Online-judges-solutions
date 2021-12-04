package LeetCode;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i, diff;
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (dict.containsKey(diff)) {
                return new int[] { dict.get(diff), i };
            } else {
                dict.put(nums[i], i);
            }
        }
        return new int[2];
    }
}