package Hackerrank.JAVA;

import java.io.*;
import java.util.*;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            if ((n >= 2 && n <= 5) || n > 20) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
