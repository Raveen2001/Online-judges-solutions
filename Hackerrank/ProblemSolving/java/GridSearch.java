package Hackerrank.ProblemSolving.java;

import java.util.Arrays;

public class GridSearch {
    public static void main(String[] args) {
        int R = 5, C = 10;
        String[] ques = new String[] { "1234567890", "0987654321", "1111111111", "1111111111", "2222222222" };
        String[] pattern = new String[] { "876543", "111111", "111111" };
        int r = 3, c = 6;
        boolean flag = false;
        Integer[][] quesI = new Integer[R][C];
        Integer[][] patternI = new Integer[r][c];
        int i, j, x, y, z;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                quesI[i][j] = ques[i].charAt(j) - '0';
            }
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                patternI[i][j] = pattern[i].charAt(j) - '0';
            }
        }
        print(quesI);
        print(patternI);
        for (i = 0; i < R - r + 1; i++) {
            for (j = 0; j < C - c + 1; j++) {
                if (quesI[i][j] == patternI[0][0]) {
                    flag = true;
                    inner: for (x = 0; x < r; x++) {
                        for (y = 0; y < c; y++) {
                            if (quesI[i + x][j + y] != patternI[x][y]) {
                                flag = false;
                                break inner;
                            }
                        }
                    }
                    if (flag) {
                        System.out.println("YES");
                        return;
                    }
                    ;
                }
            }
        }
        System.out.println("No");
        return;
    }

    public static void print(Integer[][] arr) {
        for (Integer[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
