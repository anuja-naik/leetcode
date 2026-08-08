class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = -1;
        while(low < high){
            int mid = low + (high - low)/2;
            // Min is at right half
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            // Min is at mid or low
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}