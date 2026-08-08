class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // suf[i] = maximum suffix of word2 that can be matched
        int[] suf = new int[n + 1];
        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                j--;
            }
            suf[i] = j;
        }
        suf[n] = j;

        int[] ans = new int[m];
        int idx = 0;
        boolean usedMismatch = false;

        for (int i = 0; i < n && idx < m; i++) {

            // Characters match
            if (word1.charAt(i) == word2.charAt(idx)) {
                ans[idx++] = i;
            }
            // Use the one allowed mismatch
            else if (!usedMismatch) {
                // After taking this mismatch, can the remaining suffix still match?
                if (idx == m - 1 || suf[i + 1] <= idx) {
                    ans[idx++] = i;
                    usedMismatch = true;
                }
            }
        }

        if (idx != m)
            return new int[0];

        return ans;
    }
}