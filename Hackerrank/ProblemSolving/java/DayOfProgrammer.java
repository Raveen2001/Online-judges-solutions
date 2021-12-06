package Hackerrank.ProblemSolving.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        int day = 13;
        boolean isLeap = false;
        if (year <= 1917) {
            if (year % 4 == 0) {
                day--;
            }
        } else if (year >= 1919) {
            if (year % 4 == 0) {
                day--;
                if (year % 100 == 0) {
                    if (year % 400 != 0) {
                        day++;
                    }
                }
            }
        } else
            return "26.09.1918";
        return day + ".09." + year;

    }

}

public class DayOfProgrammer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
