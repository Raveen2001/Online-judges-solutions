package LeetCode;
// 1013. Partition Array Into Three Parts With Equal Sum
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = IntStream.of(arr).sum();
        if(sum % 3 !=0 ) return false;
        int avg = sum/3;
        int partSum = 0, c = 0;
        for(int a : arr){
            partSum += a;
            if(partSum == avg){
                c++;
                partSum = 0;
            }
        }
        return c>=3;
    }
}
