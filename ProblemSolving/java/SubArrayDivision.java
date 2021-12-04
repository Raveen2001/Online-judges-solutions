package ProblemSolving.java;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(2, 2, 1, 4, 2);
        int m = 1;
        int d = 4;
        int i = 0, sum = 0, count = 0, j = 0;
        for (i = 0; i < s.size() - m + 1; i++) {
            sum = s.get(i);
            for (j = 1; j < m; j++) {
                sum += s.get(i + j);
            }
            if (sum == d) {
                count++;
            }
        }
        System.out.println(count);
    }
}
