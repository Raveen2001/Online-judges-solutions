class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n == 1) return;
        
        int pointer = n-2;
        while(pointer >= 0 && nums[pointer] >= nums[pointer+1]){
            pointer --;
        }
        if(pointer >= 0){
            int i = n - 1;
            int target = nums[pointer];
            while(target >= nums[i]){
                i--;
            }
            swap(nums, pointer, i);
        }
        
        reverse(nums, pointer + 1, n - 1);

        
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start< end){
            swap(nums, start ++, end --);
        }
    }
}
