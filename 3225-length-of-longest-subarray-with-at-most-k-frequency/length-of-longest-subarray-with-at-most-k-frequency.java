class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < nums.length; right++){
            // Put each ele in map
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

            // If freq > k then remove each left ele till window becomes valid again
            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.get(nums[left])-1);
                left ++;
            }
            // Find curr len
            int len = right - left + 1;
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}