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
     * Complete the 'happyLadybugs' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING b as parameter.
     */
    public static boolean isHappy(String b) {
        for (int i = 1; i < b.length() - 1; i++) {
            if (!(b.charAt(i) == b.charAt(i - 1) || b.charAt(i) == b.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static String happyLadybugs(String b) {
        // Write your code here
        int[] bugs = new int[27];
        int i;
        boolean flag = true;
        for (i = 0; i < b.length(); i++) {
            if (b.charAt(i) != '_')
                bugs[b.charAt(i) - 'A']++;
            else
                bugs[26]++;
        }
        for (i = 0; i < 26; i++) {
            if (bugs[i] == 1) {
                flag = false;
                break;
            }
        }

        if (flag) {
            if (bugs[26] == 0 && !isHappy(b)) {
                flag = false;
            }
        }

        if (flag)
            return "YES";
        else
            return "NO";
    }

}

public class HappyLadyBug {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String b = bufferedReader.readLine();

            String result = Result.happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
