package LeetCode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesis("(", n , 1, 0, res);
        return res;
    }
    
    public void generateParenthesis(String seq, int n, int noOfOpens, int noOfCloses, List<String> res){
        if(n == noOfOpens && n == noOfCloses){
            res.add(seq);
            return;
        }
        
        if(noOfOpens < n){
            generateParenthesis(seq + "(", n, noOfOpens + 1, noOfCloses,res);
        }
        if(noOfCloses < n && noOfOpens > noOfCloses){
            generateParenthesis(seq + ")", n, noOfOpens, noOfCloses + 1, res);
        }
    }
}