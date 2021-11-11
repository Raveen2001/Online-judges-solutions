package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

class Result2 {

    /*
     * Complete the 'findStrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY w
     *  2. INTEGER_ARRAY queries
     */

    public static List<String> findStrings(List<String> w, List<Integer> queries) {
    // Write your code here
        Set<String> subStrings = new HashSet<>();
        for(String s: w){
            for(int i = 0; i<s.length(); i++){
                for(int j = i+1; j<=s.length();j++){
                    subStrings.add(s.substring(i, j));
                }
            }
        }
        List<String> sub = new ArrayList<>(subStrings);
        Collections.sort(sub);
        List<String> res = queries.stream().map(q->getValue(sub, q)).collect(Collectors.toList());
        return res;
    }

    public static String getValue(List<String> sub, int q){
        if(q-1<sub.size()){
            return sub.get(q-1);
        }else{
            return "INVALID";
        }
    }

}

public class FindString {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int wCount = Integer.parseInt(bufferedReader.readLine().trim());
        // List<String> w = IntStream.range(0, wCount).mapToObj(i -> {
        //     try {
        //         return bufferedReader.readLine();
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // })
        //     .collect(toList());

        List<String> w = new ArrayList<String>();
        w.add("aab");
        w.add("aac");

        // int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        // List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
        //     try {
        //         return bufferedReader.readLine().replaceAll("\\s+$", "");
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // })
        //     .map(String::trim)
        //     .map(Integer::parseInt)
        //     .collect(toList());
        List<Integer> queries = new ArrayList<Integer>();
        queries.add(3);
        queries.add(8);
        queries.add(24);


        List<String> result = Result2.findStrings(w, queries);



    //     bufferedWriter.write(
    //         result.stream()
    //             .collect(joining("\n"))
    //         + "\n"
    //     );
            System.out.println(result.stream()
                .collect(Collectors.joining("\n")));

    //     bufferedReader.close();
    //     bufferedWriter.close();
    }
}
