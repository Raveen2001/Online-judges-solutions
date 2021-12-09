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
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    static List<Integer> r = new ArrayList<>();

    public static void cutTheSticks(List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        int min = 0;
        if (arr.size() > 0) {
            min = Collections.min(arr);
        }
        int len = 0;
        int i;
        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0)
                len++;
        }
        if (len == 0)
            return;
        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0 && arr.get(i) - min != 0)
                res.add(arr.get(i) - min);
        }
        r.add(len);
        cutTheSticks(res);

    }

}

public class CutTheSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.cutTheSticks(arr);

        bufferedWriter.write(
                Result.r.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
