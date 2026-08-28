class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        // int w = right - left;                               // dist between heights (indices)
        // int h = Math.min(height[left], height[right]);    // max height causes overflow
        // int area = w * h;
        while(left < right){
            maxArea = Math.max(maxArea, (right - left) * (Math.min(height[left], height[right])));
            if(height[left] < height[right]){
                left ++;
            }
            else{
                right --;
            }
        }
        return maxArea;
    }
}