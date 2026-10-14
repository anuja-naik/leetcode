class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        int actSum = 0;
        for(int i=0; i<nums.length; i++){
            actSum += nums[i];
        }
        return sum - actSum;
    }
}