package LeetCode;

import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> open = Arrays.asList('(', '{', '[');
        List<Character> close = Arrays.asList(')', '}', ']');
        for(char a : s.toCharArray()){
            if(open.contains(a)){
                stack.push(a);
            }else{
                if(stack.isEmpty()) return false;
                char temp = stack.pop();
                if(!isMatch(temp, a)) return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
    
    public boolean isMatch(char a, char b){
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }
}
