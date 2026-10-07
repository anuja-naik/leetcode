class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        String ans = "";

        for (String word : words) {
            if (word.length() > 2) {
                for (int i = 0; i < word.length(); i++) {
                    if (i == 0)
                        ans += Character.toUpperCase(word.charAt(i));
                    else
                        ans += word.charAt(i);
                }
            } else {
                ans += word;
            }

            ans += " ";
        }

        return ans.trim();
    }
}