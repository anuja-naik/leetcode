class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int i=0; i< nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        int low = 1; 
        int high = max;

        while(low < high){
            int mid = low + (high - low)/2;

            long sum = 0;
            for(int i= 0; i<nums.length; i++){
                sum += (nums[i] + mid - 1)/mid;
            }
            if(sum <= threshold){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}