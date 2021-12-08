package Hackerrank.JAVA;

import java.io.*;
import java.util.*;

public class Formatting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        int mark;
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            name = s.next();
            mark = s.nextInt();
            System.out.printf("%-15s%03d\n", name, mark);
        }
        System.out.println("================================");
    }
}
