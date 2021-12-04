package LeetCode;

public class VowelsOfAllSubStrings {
    // leetcode
    public long countVowels(String word) {
        int i;
        long count = 0;
        int n = word.length();
        for (i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count += (long) (i + 1) * (long) (n - i);
            }
        }
        return count;
    }
}
