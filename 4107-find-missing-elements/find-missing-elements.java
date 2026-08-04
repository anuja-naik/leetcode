class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE; // Max Integer val is assigned as min 
        int max = Integer.MIN_VALUE; // Min Int val is assigned as max 
        for(int num: nums){
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        } 

        List<Integer> list = new ArrayList<>();
        for(int i=min; i<max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}