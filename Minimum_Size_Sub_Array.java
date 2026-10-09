/*
    Problem: Minimum Size sub Array
    Algorithm:
    1. we have to use the sliding window with the variable size by 
    taking the condition and hadling it.
    2. we have to check every time whether the sum is equal to or greater
    to the given target so that we can keep the track of the min_length
    of the sub array.
    3. after that we will return the min_length of the array.
*/

// Source Code:

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min_len=999999;
        int left =0;
        int right=0;
        while(right<nums.length||sum>=target){
            if(sum>=target){
                if((right-left)<min_len){
                    min_len=right-left;
                }
                sum=sum-nums[left];
                left++;
            }else{
                if(right<nums.length){
                    sum=sum+nums[right];
                    right++;
                }
            }
        }
        return min_len == 999999 ? 0 : min_len;
    }
}