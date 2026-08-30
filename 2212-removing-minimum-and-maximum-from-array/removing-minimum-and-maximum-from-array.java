class Solution {
    public int minimumDeletions(int[] nums) {
        // int max = -1;
        // int min = -1; here bug occurs as -1  is always lesser than any other ele

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int idx1 = -1;
        int idx2 = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == min){
                idx1 = i;
            }
            if(nums[i] == max){
                idx2 = i;
            }
        }

        int left = Math.min(idx1, idx2);
        int right = Math.max(idx1, idx2);

        // Delete from front
        int option1 = right + 1;

        // Delete from end
        int option2 = nums.length - left;

        // Delete one-one element from both ends
        int option3 = (left+1) + (nums.length-right);

        return Math.min(option1, Math.min(option2, option3));
    }
}