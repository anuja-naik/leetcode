class Solution {
    public int compress(char[] chars) {
        String result = "";
        for(int i=0; i<chars.length; i++){
            Integer count = 1;
            while(i < chars.length-1 && chars[i] == chars[i+1]){
                count ++;
                i ++;
            }
            result += chars[i];
            if(count > 1){
                result += count.toString();
            }
        }
        for(int i=0; i<result.length(); i++){
            chars[i] = result.charAt(i);
        }
        return result.length();
    }
}