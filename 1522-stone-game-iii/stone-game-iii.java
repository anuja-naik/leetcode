class Solution {
    int[] dp;
    int[] stone;

    public String stoneGameIII(int[] stoneValue) {
        stone = stoneValue;
        int n = stone.length;
        dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);

        int diff = solve(0);

        if (diff > 0) return "Alice";
        if (diff < 0) return "Bob";
        return "Tie";
    }

    private int solve(int i) {
        if (i >= stone.length)
            return 0;

        if (dp[i] != Integer.MIN_VALUE)
            return dp[i];

        int sum = 0;
        int best = Integer.MIN_VALUE;

        for (int k = 0; k < 3 && i + k < stone.length; k++) {
            sum += stone[i + k];
            best = Math.max(best, sum - solve(i + k + 1));
        }

        return dp[i] = best;
    }
}