class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        ArrayList<Integer> positions = new ArrayList<>();

        // Store positions of all 1s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                positions.add(i);
            }
        }

        String ans = "";
        int minLength = Integer.MAX_VALUE;

        // Take every group of k consecutive 1s
        for (int i = 0; i + k - 1 < positions.size(); i++) {

            int start = positions.get(i);
            int end = positions.get(i + k - 1);

            String sub = s.substring(start, end + 1);

            if (sub.length() < minLength) {
                minLength = sub.length();
                ans = sub;
            }
            else if (sub.length() == minLength && sub.compareTo(ans) < 0) {
                ans = sub;
            }
        }

        return ans;
    }
}