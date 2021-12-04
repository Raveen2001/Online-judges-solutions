package ProblemSolving.java;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        // List<Integer> s = Arrays.asList(2, 2, 1, 4, 2);
        int[] squares = { 2, 2, 1, 3, 2 };
        int m = 2;
        int d = 4;
        int n = 5;
        int i = 0, sum = 0, count = 0, j = 0;
        // for (i = 0; i < s.size() - m + 1; i++) {
        // sum = s.get(i);
        // for (j = 1; j < m; j++) {
        // sum += s.get(i + j);
        // }
        // if (sum == d) {
        // count++;
        // }
        // }
        if (m > n) {
            System.out.println(0);
            return;
        }
        int ct = 0;
        for (i = 0; i < m - 1; i++) {
            sum += squares[i];
        }
        System.out.println(sum);
        for (j = m - 1; j < n; j++) {
            System.out.println("sub" + ((j - m) < 0 ? 0 : squares[j - m]));
            System.out.println("ADd" + squares[j]);
            sum -= (j - m) < 0 ? 0 : squares[j - m];
            sum += squares[j];
            if (sum == d)
                ct++;
        }
        System.out.println(ct);
        // System.out.println(count);
    }
}
