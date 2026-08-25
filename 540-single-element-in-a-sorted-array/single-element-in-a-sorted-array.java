class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            int freq = set.getValue();
            int ele = set.getKey();
            if(freq == 1){
                return ele;
            }
        }
        return -1;
    }
}