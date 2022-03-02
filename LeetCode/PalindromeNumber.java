package LeetCode;
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x!= 0 && x%10 == 0) return false;
        int rev = 0;
        int temp = x;
        while(x>0){
            rev = (rev*10) + x%10;
            x /= 10;
        }
        if(temp == rev) return true;
        return false;
    }
}
