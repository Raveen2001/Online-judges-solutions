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
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static List<String> cavityMap(List<String> grid) {
        // int rowS = 0;
        // int rowE = grid.size() - 1;
        // int colS = 0;
        // int i,j;
        // int colE = grid.get(0).length()-1;
        // for(i = 1; i<colE; i++){
        // for(j = 1; j<colE; j++){
        // char c = grid.get(i).charAt(j);
        // System.out.println("Checking : " + c);
        // if(c >= grid.get(i).charAt(j-1) && c>= grid.get(i).charAt(j+1) && c>=
        // grid.get(i-1).charAt(j) && c>= grid.get(i+1).charAt(j)){
        // String temp = grid.get(i);
        // grid.set(i, temp.substring(0, i) + 'X' + temp.substring(i+1, temp.length()));
        // }
        // }
        // }

        // return grid;

        int i, j, n = grid.size();
        char[][] a = new char[n][];
        for (i = 0; i < n; i++) {
            a[i] = grid.get(i).toCharArray();
        }
        for (i = 1; i < n - 1; i++) {
            for (j = 1; j < n - 1; j++) {
                if (a[i][j] > a[i][j + 1] && a[i][j] > a[i][j - 1] && a[i][j] > a[i + 1][j] && a[i][j] > a[i - 1][j]) {
                    a[i][j] = 'X';
                    // j++;
                }
            }
        }

        for (i = 0; i < n; i++) {
            grid.set(i, new String(a[i]));
        }
        return grid;

    }

}

public class CavityMap {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> result = Result.cavityMap(grid);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
