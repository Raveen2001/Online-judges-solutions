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


// method 2 -- optimal o(n)

class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        char prev = s.charAt(0);
        res.append(prev);
        int freq = 1;
        for(int i = 1; i<s.length(); i++){
            if(prev == s.charAt(i)){
                freq++;
            }else{
                prev = s.charAt(i);
                freq = 1;
            }
            if(freq > 2){
                continue;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}
