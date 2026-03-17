/* 
Given : we have given 1 array but in that we have integers.
Task : we have to produce the prefix sums for every element
Time Complexity : O(n)
My approach : 1. we have to traverse through a loop so that we can add the elements at every element.
2. we can definitely get the sum at every element.
*/
//Source Code :
class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0]= nums[0];
        for(int i =1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        return sum;
    }
}
