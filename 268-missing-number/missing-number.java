class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0; i<= nums.length; i++){
            sum += i;
        }
        int actualSum = 0;
        for(int i=0; i<nums.length; i++){
            actualSum += nums[i];
        }

        return sum - actualSum;
    }
}