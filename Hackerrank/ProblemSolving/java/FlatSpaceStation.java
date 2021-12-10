package Hackerrank.ProblemSolving.java;

import java.util.*;

public class FlatSpaceStation {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] ss = new int[m];
        int i;
        for (i = 0; i < m; i++) {
            ss[i] = s.nextInt();
        }
        Arrays.sort(ss);
        int first = ss[0];
        int last = n - 1 - ss[m - 1];
        int max = Math.max(first, last);
        int maxSpaceDistance = 0;
        for (i = 0; i < m - 1; i++) {
            maxSpaceDistance = Math.max(ss[i + 1] - ss[i], maxSpaceDistance);
        }

        System.out.println(Math.max(max, maxSpaceDistance / 2));
    }
}