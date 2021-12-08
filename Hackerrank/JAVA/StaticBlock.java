package Hackerrank.JAVA;

import java.io.*;
import java.util.*;

public class StaticBlock {
    static {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int h = s.nextInt();
        try {
            if (b > 0 && h > 0)
                System.out.println(b * h);
            else
                throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}
