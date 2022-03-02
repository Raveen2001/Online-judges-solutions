package LeetCode;

class Solution {
    public int[][] transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j< matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}
