class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq1[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            int idx = s1.charAt(i) - 'a';
            freq1[idx] ++;
        }

        int winSize = s1.length();

        for(int i=0; i<s2.length(); i++){
            int winIdx = 0, idx = i;
            int freq2[] = new int[26];
            while(winIdx < winSize && idx<s2.length()){
                freq2[s2.charAt(idx) - 'a']++;
                winIdx ++;
                idx ++;
            }
            if(java.util.Arrays.equals(freq1, freq2)){
                return true;
            }
        }
        return false;
    }
}