package LeetCode;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int sp = 0;
        int tp = 0;
        while(tp < t.length()){
            if(t.charAt(tp) == s.charAt(sp)){
                sp++;
            }
            tp++;
            if(sp == s.length()) return true;
        }
        return false;
    }
}