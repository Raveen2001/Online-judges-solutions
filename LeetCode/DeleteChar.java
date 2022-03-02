package LeetCode;

class Solution {
    public String makeFancyString(String s) {
        for(int i = 0; i<s.length() - 2; i++){
            char c = s.charAt(i);
            boolean toRemove = true;
            for(int j = i+1; j<i+3; j++){
                if(c != s.charAt(j)){
                    toRemove = false;
                    break;
                }
            }
            if(toRemove){
                s = s.substring(0, i) + s.substring(i+1);
                i--;
            }
        }
        return s;
    }
}
