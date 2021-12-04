package SuperPACC.PhaseI;

import java.io.*;
import java.util.*;

public class PatternPrinting {

    public static void printPattern(int n) {
        int col = (n - 1) * 2 + 1;
        int row = col;
        int i, j, ch = n;
        boolean inc = false, dec = false;
        for (i = 0; i < n; i++) {
            ch = n;
            dec = false;
            inc = false;
            for (j = 0; j < col; j++) {

                if (inc)
                    ch++;
                if (dec)
                    ch--;
                System.out.print(ch + " ");
                // if(ch)
                dec = false;
                if (ch - i < n && i > j && !inc) {
                    dec = true;
                }

                if (j == col - i - 1) {
                    inc = true;
                }
            }
            System.out.println();
        }
        for (i = n - 2; i >= 0; i--) {
            ch = n;
            dec = true;
            inc = false;
            for (j = 0; j < col; j++) {

                System.out.print(ch + " ");

                if (i == j)
                    dec = false;
                if (j == col - 1 - i)
                    inc = true;
                if (dec)
                    ch--;
                if (inc)
                    ch++;
                // if()

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        printPattern(n);
    }
}
