class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // Find pivot
        int pivot = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;              // idx 
                break;
            }
        }
        // If arr does not have lexicographical larger rearrangement then reverse arr
        if(pivot == -1){
            int i = 0;
            int j = n-1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i ++;
                j --;
            }
            return;
        }

        // Find next larger element right after pivot and swap it with pivot
        for(int i = n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // Reverse elements from pivot+1 to n-1
        int i = pivot + 1;
        int j = n - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i ++;
            j --;
        }
    }
}