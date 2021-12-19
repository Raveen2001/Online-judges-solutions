package SuperPACC.PhaseI;

import java.util.*;

public class IronManTrainee {

    static int count = 0;

    // Dont use this method use mathematical way... python code is in mathematical
    // way
    public static void findSequence(char t1, char t2, String s) {
        // System.out.println("String : " + s + " Length : " + s.length());
        if (s.length() == 0) {
            // System.out.println("returning " + s);
            return;
        }
        if (t1 == 'd')
            t1 = 'c';
        if (t2 == 'd')
            t2 = 'c';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t1 || s.charAt(i) == t2) {
                if (s.charAt(i) == 'c') {
                    count++;
                    // System.out.println("Increamenting count : " + count + " for : " + s + " At :
                    // " + i);
                    // findC = false;
                }
                findSequence(s.charAt(i), (char) (s.charAt(i) + 1), s.substring(i + 1));
                // System.out.println("returning " + s);
            }
            // if(s.charAt(i) == t1) return;
        }
        // System.out.println("returning " + s);
        return;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int lastC = s.lastIndexOf("c");
        s = s.substring(0, lastC + 1);
        // System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                // System.out.println((char)('a' + 1));
                findSequence('a', 'b', s.substring(i + 1));
            }
        }
        System.out.println(count);
    }
}