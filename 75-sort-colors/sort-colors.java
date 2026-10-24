class Solution {
    public void sortColors(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        for(int num: nums){
            if(num == 0){
                c1 ++;
            }
            if(num == 1){
                c2 ++;
            }

            if(num ==2){
                c3 ++;
            }
        }

        int i= 0;
        while(c1 > 0){
            nums[i] = 0;
            c1 --;
            i ++;
        }
        while(c2 > 0){
            nums[i] = 1;
            c2 --;
            i ++;
        }
        while(c3 > 0){
            nums[i] = 2;
            c3 --;
            i ++;
        }
    }
}