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
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic, int n, int m) {
        List<Integer> res = new ArrayList<>();
        int maxTopics = 0;
        int count = 0;
        int topics = 0;
        int i, j, x;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                topics = 0;
                for (x = 0; x < m; x++) {
                    if (topic.get(i).charAt(x) - '0' > 0 || topic.get(j).charAt(x) - '0' > 0)
                        topics++;

                }
                System.out.println("Max Topic" + topics);
                if (topics == maxTopics) {
                    count++;
                } else if (topics > maxTopics) {
                    maxTopics = topics;
                    count = 1;
                }
            }

        }
        res.add(maxTopics);
        res.add(count);
        return res;
    }

}

public class ICIPTeam {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String topicItem = bufferedReader.readLine();
            topic.add(topicItem);
        }

        List<Integer> result = Result.acmTeam(topic, n, m);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
