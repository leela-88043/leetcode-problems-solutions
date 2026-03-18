/* 
Given : we have one array with the heights of the towers
Task : we have to find the maximum capacity of the water that can be stored in the water tank.
Approach : 1. we have to use two pointers algorithm in a way that we have to record the capacity of storing the water for every gaps.
2. but we have to select the gaps in a way that if the less hieght side should be moved so that we can find in a way the max capacity of the water to be stored.
*/
//Source Code :
class Solution {
    public int maxArea(int[] height) {
        int left =0,right = height.length-1;
        int maxarea =0;
        while(left<right){
            maxarea = Math.max(maxarea,Math.min(height[right],height[left]) * (right - left)); 
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxarea;
    }
}
