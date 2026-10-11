/*
    Problem: Maximum Consecutive ones 3
    Algorithm:
    1. we have to use the variable sliding window concept by running
    a loop.
    2. we will check the condition if count>k then we will remove the
    element when the 0 is removed continously
    3. then we will move the left pointer.
    4. we will count the zeros so that we can keep the track of how
    many zeros can be replaced
*/

// Source Code:

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int count =0;
        int max_len=0;
        while(right<nums.length){
            if(nums[right]==0){
                count++;
            }
            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            if(max_len<=right-left+1){
                max_len=right-left+1;
            }
            right++;
        }
        return max_len;
    }
}