package SuperPACC.PhaseI;

import java.io.*;
import java.util.*;
import java.math.*;

public class BiggestHolaNumber {

    public static long hola(long n) {
        long sqrt = (long) Math.sqrt(n);
        List<Long> x = new ArrayList<Long>();
        boolean flag = false;
        long i, f = n, j;
        for (i = n; i >= 2; i--) {
            if (n % i == 0) {
                x.add(i);
            }
        }
        for (i = 0; i < x.size(); i++) {
            long y = x.get((int) i);
            flag = true;
            for (j = y / 2; j >= 2; j--) {
                if (y % (j * j) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return y;
        }
        // System.out.println(x.toString());
        // System.out.println(sqrt);
        // if(flag) return i;
        return n;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        System.out.println(hola(n));
    }
}
