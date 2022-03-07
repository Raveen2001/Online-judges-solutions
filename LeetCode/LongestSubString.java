package LeetCode;

class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i = 0; i<s.length(); i++){
            res = extendPalindrome(s, i, i, res); // odd length
            res = extendPalindrome(s, i, i+1, res); // even length
        }
        return res;
    }
    
    public String extendPalindrome(String str, int s, int e, String res){
        if(e>=str.length()) return res;
        while(s >= 0 && e<str.length() && str.charAt(s) == str.charAt(e)){
            s --;
            e ++;
        }
        
        int len = (e - s) - 1;
        System.out.println(len);
        if(len > res.length()){
            res = str.substring(s+1, e);
        }
        return res;
    }
}
