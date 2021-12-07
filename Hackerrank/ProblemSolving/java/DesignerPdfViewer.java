package Hackerrank.ProblemSolving.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class DesignerPdfViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] c = new int[26];
        for (int i = 0; i < 26; ++i) {
            c[i] = in.nextInt();
        }
        String w = in.next();
        int maxH = 0;
        for (char letter : w.toCharArray()) {
            if (c[letter - 'a'] > maxH)
                maxH = c[letter - 'a'];
        }
        System.out.println(maxH * w.length());
    }

}