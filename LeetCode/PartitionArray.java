package LeetCode;

import java.util.stream.IntStream;

// 1013. Partition Array Into Three Parts With Equal Sum
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = IntStream.of(arr).sum();
        if(sum % 3 !=0 ) return false;
        int avg = sum/3;
        int partSum = 0, nextStart = -1;
        for(int i = 0; i<arr.length - 2; i++){
            partSum += arr[i];
            if(partSum == avg){
                nextStart = i+1;
                break;
            }
        }
        if(nextStart == -1) return false;
        partSum = 0;
        for(int i = nextStart; i<arr.length - 1; i++){
            partSum += arr[i];
            if(partSum == avg){
                return true;
            }
        }
        return false;
    }
}