package Hackerrank.JAVA;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class Loop2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            // System.out.println(a + " " + b + " " + n);
            int res = a;
            for (int j = 0; j < n; j++) {
                // System.out.print(res + "+" + a + "+" + b + "*" + Math.pow(b,j));
                res += (b * Math.pow(2, j));
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
