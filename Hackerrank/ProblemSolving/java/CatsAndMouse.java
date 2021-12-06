package Hackerrank.ProblemSolving.java;

import java.util.*;

public class CatsAndMouse {

    public static String catAndMouse(int x, int y, int z) {
        int cat1 = Math.abs(x - z);
        int cat2 = Math.abs(y - z);
        if (cat1 == cat2)
            return "Mouse C";
        else if (cat1 < cat2)
            return "Cat A";
        else
            return "Cat B";
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            System.out.println(catAndMouse(x, y, z));
        }
    }
}
