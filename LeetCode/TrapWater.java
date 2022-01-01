package LeetCode;

class TrapWater {
    public int trap(int[] height) {
        int n = height.length, i, j;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
            // rightMax[i] = max({height[i], height[i+1], ..., height[n-1]})
            // rightMax[i+1] = max({height[i+1], height[i+2], ..., height[n-1]})
        }

        int ans = 0;
        for (i = 1; i < n - 1; i++) {
            // min(leftmax, rightmax) - height[i]
            ans += Math.max(0, Math.min(leftMax[i - 1], rightMax[i + 1]) - height[i]);
        }

        return ans;
    }
}
