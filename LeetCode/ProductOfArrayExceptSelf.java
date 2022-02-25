package LeetCode;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] pref = new int[nums.length + 1];
        int[] suf = new int[nums.length + 1];
        pref[0] = 1;
        suf[0] = 1;
        for(int i = 0; i<nums.length; i++){
            pref[i+1] = pref[i] * nums[i];
        }
        return ans;
    }
}
