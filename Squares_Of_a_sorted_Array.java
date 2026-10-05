/*
    Problem: Square of a sorted array
    Algorithm: 
    1. we have to first square the numbers in the array.
    2. the logic is the largest number will be in the right side or left
    side of the array.
    3. if we compare between these two numbers by two pointer approach
    then we will get the required sorted array.
*/

// Source code:

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int i = 0;
        int j = nums.length-1;
        int pos = nums.length-1;
        while(i<=j){
            if(nums[i]>nums[j]){
                result[pos]=nums[i];
                i++;
            }else{
                result[pos]=nums[j];
                j--;
            }
            pos--;
        }
        return result;
    }
}