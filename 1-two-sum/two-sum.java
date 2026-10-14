class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int required = target - nums[i];
            if(map.containsKey(required)){
                return new int[]{i, map.get(required)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}