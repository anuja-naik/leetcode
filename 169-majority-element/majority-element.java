class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int n = nums.length;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int freq = entry.getValue();
            int ele = entry.getKey();
            if(freq > n/2){
                return ele;
            }
        }
        return -1;
    }
}