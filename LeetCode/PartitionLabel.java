package LeetCode;

import java.util.ArrayList;
import java.util.List;

class PartitionLabel {
    public List<Integer> partitionLabels(String s) {
        int[] lastOcc = new int[26];
        int i, n = s.length();
        for (i = 0; i < n; i++) {
            lastOcc[s.charAt(i) - 'a'] = i;
        }

        List<Integer> ans = new ArrayList<>();
        int start = 0, end = 0;

        for (i = 0; i < n; i++) {
            end = Math.max(end, lastOcc[s.charAt(i) - 'a']);
            if (end == i) {
                ans.add(end - start + 1);
                start = i + 1;
            }
        }

        return ans;
    }
}