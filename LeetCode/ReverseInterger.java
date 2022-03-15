package LeetCode;

class Solution {
    public int reverse(int x) {
        int res = 0;
        int newRes = 0;
        while(x != 0){
            int rem = x%10;
            newRes = res * 10 + rem;
            if((newRes - rem) / 10 != res) return 0;
            res = newRes;
            x = x/10;
        }
        return res;
    }
}
