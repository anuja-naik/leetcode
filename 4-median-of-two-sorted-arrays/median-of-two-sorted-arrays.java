class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        int[] temp = new int[nums1.length + nums2.length];
        int k = 0;
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] < nums2[right]){
                temp[k] = nums1[left];
                left ++;
            }
            else{
                temp[k] = nums2[right];
                right ++;
            }
            k ++;
        }
        while(left < nums1.length){
            temp[k] = nums1[left];
            left ++;
            k++;
        }
        while(right < nums2.length){
            temp[k] = nums2[right];
            right ++;
            k ++;
        }

        int n = temp.length;
        if(n % 2 == 1){
            return temp[n/2];               // If arr size id odd
        }
        else{
            return (temp[n/2 - 1] + temp[n/2])/2.0; 
        }
        
    }
}