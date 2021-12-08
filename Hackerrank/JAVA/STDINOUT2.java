package Hackerrank.JAVA;

import java.io.*;
import java.util.*;

public class STDINOUT2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        Double b = s.nextDouble();
        s.nextLine();
        String str = s.nextLine();
        System.out.println("String: " + str);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
