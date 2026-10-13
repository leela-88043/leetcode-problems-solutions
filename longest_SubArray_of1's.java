/*
    Problem: Longest subarray of 1's
    Algorithm:
    1. we have to slide when we witness 1 when we witness 0's we will count
    it.
    2. we will handle the variable size window by sliding window approach
    3. now we will run the loop for deleting all the elements from the left
    until there is only 1 zero left for changing
    4. we will just start from the start of the arrayby adding one by one 
    element.
*/

// Source Code:

class Solution {
    public int longestSubarray(int[] nums) {
        int right =0;
        int left =0;
        int count=0;
        int max_len=0;
        while(right<nums.length){
            if(nums[right]==0){
                count++;
            }
            while(count>1){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            if(max_len<right-left){
                max_len=right-left;
            }
            right++;
        }
        return max_len;
    }
}