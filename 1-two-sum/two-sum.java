class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            int required = target - nums[i];
            if(map.containsKey(required)){
                return new int[]{map.get(required), i};
            }
            else{
                map.put(current, i); //Element , index
            }
        }
        return new int[]{};
    }
}