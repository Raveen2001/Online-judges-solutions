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

    static Stack<String> password;
    static Set<String> badAttempt;

    /*
     * Complete the 'passwordCracker' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING_ARRAY passwords
     * 2. STRING loginAttempt
     */

    public static boolean passwordCracker(List<String> passwords, String loginAttempt) {
        // Write your code here
        if (badAttempt.contains(loginAttempt))
            return false;
        if (loginAttempt.length() == 0) {
            return true;
        }
        for (String pass : passwords) {
            if (loginAttempt.startsWith(pass) && passwordCracker(passwords, loginAttempt.substring(pass.length()))) {
                password.push(pass);
                return true;
            }
        }
        badAttempt.add(loginAttempt);
        return false;
    }

    public static String getPassword() {
        String res = password.pop();
        while (!password.isEmpty()) {
            res += " " + password.pop();
        }
        return res;
    }

}

public class PasswordCracker {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                Result.badAttempt = new HashSet<>();
                Result.password = new Stack<>();
                List<String> passwords = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList());

                String loginAttempt = bufferedReader.readLine();

                boolean result = Result.passwordCracker(passwords, loginAttempt);
                if (result) {
                    bufferedWriter.write(Result.getPassword());
                } else {
                    bufferedWriter.write("WRONG PASSWORD");
                }
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
