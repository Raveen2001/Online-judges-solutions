package Hackerrank.ProblemSolving.java;

import java.io.*;
import java.util.*;

public class BiggerIsGreater {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        if (t >= 1 && t <= 100000) {
            for (int i = 0; i < t; i++) {
                String str = sc.nextLine();
                System.out.println(process(str));
            }
        }
    }

    private static String process(String str) {
        char[] chars = str.toCharArray();
        int i = chars.length - 1;
        while (i > 0) {
            if (chars[i - 1] >= chars[i]) {
                i--;
            } else {
                int j = i;
                while (j < chars.length && chars[j] > chars[i - 1]) {
                    j++;
                }
                char temp = chars[i - 1];
                chars[i - 1] = chars[j - 1];
                chars[j - 1] = temp;

                char[] newChar = new char[chars.length];
                for (int k = 0; k < i; k++) {
                    newChar[k] = chars[k];
                }
                int end = chars.length - 1;
                for (int k = i; k < chars.length; k++) {
                    newChar[k] = chars[end--];
                }
                return new String(newChar);
            }
        }
        return "no answer";
    }

}