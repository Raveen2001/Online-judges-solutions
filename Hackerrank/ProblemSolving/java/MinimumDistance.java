package Hackerrank.ProblemSolving.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    static Map<Integer, Integer> map = new HashMap<>();

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        int i, j;
        int min = a.size();
        for (i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                if (i - map.get(a.get(i)) < min)
                    min = i - map.get(a.get(i));
                if (min == 1)
                    return 1;
                map.put(a.get(i), i);
            } else {
                map.put(a.get(i), i);
            }
        }
        if (min == a.size())
            min = -1;
        return min;
    }

}

public class MinimumDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
