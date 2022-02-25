package LeetCode;

class MissingPositiveInteger{
    public static void main(String[] args) {
        
    }

    public static int firstMissingPositive(int[] nums) {
        for(int i =0; i<nums.length; i++){
            if(nums[i] <= 0){
                nums[i] = nums[i] + 1;
            }
        }

        for(int i = 0; i<nums.length; i++){
            int p = nums[i];
            if(p<0){
                p *= -1;
            }
            if(p<=nums.length){
                nums[p-1] = nums[p-1] * (-1);
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
    
}