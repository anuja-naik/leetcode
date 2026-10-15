class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ps = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            ps += nums[i];
            int required = ps - k;
            if(map.containsKey(required)){
                count += map.get(required);
            }
            map.put(ps, map.getOrDefault(ps, 0)+1);
        }
        return count;
    }
}