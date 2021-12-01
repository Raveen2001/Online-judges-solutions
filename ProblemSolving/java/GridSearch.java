package ProblemSolving.java;

public class GridSearch {
    public static void main(String[] args){
        int R = 5, C = 10;
        String[] ques = new String[]{"1234567890", "0987654321", "1111111111", "1111111111", "2222222222"};
        String[] pattern = new String[]{"876543", "111111", "111111"};
        int r = 3, c = 6;
        Integer[][] quesI = new Integer[R][C];
        Integer[][] patternI = new Integer[r][c];
        int i, j;
        for(i = 0; i<R; i++){
            for(j = 0; j<C; j++){
                quesI[i][j] = ques[i].charAt(j) - '0';
            }
        } 
        for(i = 0; i<r; i++){
            for(j = 0; j<c; j++){
                patternI[i][j] = pattern[i].charAt(j) - '0';
            }
        }
        
    }
}
