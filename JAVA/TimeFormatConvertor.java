package JAVA;

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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String militaryTime;
        Boolean isAM;
        int strlen = s.length();
        System.out.println(s.substring(strlen-2, strlen));
        isAM = s.substring(strlen-2, strlen).equals("AM")? true: false;
        int hours = Integer.parseInt(s.substring(0,2));
        String min_sec = s.substring(3,8);
        
        // System.out.println(hours + ":" + min + ":" + sec + ":" + isAM);
        
        if (isAM){
            hours = (hours == 12)? hours - 12: hours;
            militaryTime = getString(hours) + ":" + min_sec;  
        }else{
            hours = (hours <= 11)? hours + 12: hours;
            militaryTime = getString(hours) + ":" + min_sec;;
        }
        return militaryTime;
    }

    public static String getString(int a){
        String str = Integer.toString(a);
        if (str.length() == 1){
            str = "0"+str;
        }
        return str;
    }

}

public class TimeFormatConvertor {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "11:01:00PM";

        String result = Result.timeConversion(s);
        System.out.println(result);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}

