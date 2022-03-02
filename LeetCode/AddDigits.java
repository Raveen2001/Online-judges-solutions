package LeetCode;

class Solution {
    public int addDigits(int num) {
        int sum = num;
        while(num%10 != num){
            sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return sum;
    }
}