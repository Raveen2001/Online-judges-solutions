class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0;
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == '(') open ++;
            else if(c == ')'){
                if(open > 0) open --;
                else continue;
            }
            res1.append(c);
        }
        for(int i = res1.length() - 1; i>=0; i--){
            if(res1.charAt(i) == '(' && open > 0){
                open --;
                continue;
            }
            res2.append(res1.charAt(i));
        }
        
        return res2.reverse().toString();
    }
}