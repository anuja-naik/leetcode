class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOcc(nums, target);
        int last = lastOcc(nums, target);
        return new int[]{first, last};
    }

    public int firstOcc(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;                     // target found move left
            }
            else if(target < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int lastOcc(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;              // Target found move right  
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}