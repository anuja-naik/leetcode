class Solution {
    public String capitalizeTitle(String title) {
        
        String[] words = title.toLowerCase().split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            
            if (words[i].length() > 2) {
                words[i] = Character.toUpperCase(words[i].charAt(0))
                        + words[i].substring(1);
            }

            result += words[i];

            if (i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }
}