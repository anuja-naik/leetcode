class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public int mergeSort(int[] nums, int low, int high){
        int count = 0;
        if(low >= high){
            return count;
        }

        int mid = (low+high)/2;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);

        return count;
    }

    public int countPairs(int[] nums, int low, int mid, int high){
        int count = 0;
        int right = mid+1;
        for(int i=low; i<=mid; i++){
            while(right <= high && (long)nums[i] > (long)2*nums[right]) {
                right ++;
            }

            count += (right - (mid+1));
        }
        return count;
    }

    public void merge(int[] nums, int low, int mid, int high){
        int left = low;
        int right = mid+1;

        int temp[] = new int[high-low+1];
        int k =0;

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp[k] = nums[left];
                left ++;
            }
            else{
                temp[k] = nums[right];
                right ++;
            }
            k ++;
        }

        while(left <= mid){
            temp[k] = nums[left];
            left ++;
            k ++;
        }

        while(right <= high){
            temp[k] = nums[right];
            right ++;
            k ++;
        }

        for(int i=0; i<temp.length; i++){
            nums[low+i] = temp[i];
        }
    }
}