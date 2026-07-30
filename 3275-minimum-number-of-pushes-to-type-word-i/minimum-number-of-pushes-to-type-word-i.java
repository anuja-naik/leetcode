class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int groups = len / 8;           // Complete group of 8 letters
        int rem = len % 8;              // Remaining letters

        return (4 * groups + rem) * (groups + 1);

    }
}