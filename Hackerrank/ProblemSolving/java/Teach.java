package Hackerrank.ProblemSolving.java;

import java.util.Scanner;

public class Teach {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int res = cal(x, n, 0, 1, 0);

        System.out.println("Count: " + res);
    }

    private static int cal(int x, int n, int carry, int cur, int count) {
        int sum = carry + (int) Math.pow(cur, n);
        if (sum > x)
            return count;
        if (sum == x) {
            count++;
            return count;
        }
        return cal(x, n, carry, cur + 1, count) + cal(x, n, sum, cur + 1, count);
    }
}
