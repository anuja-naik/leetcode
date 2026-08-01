class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        for(int i=0; i<nums.length; i++){
            int prod = 1;
            for(int j=i; j<nums.length; j++){
                prod *= nums[j];

                if(prod > maxProd){
                    maxProd = prod;
                }
            }
        }
        return maxProd;
    }
}