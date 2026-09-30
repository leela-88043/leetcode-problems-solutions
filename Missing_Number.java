/*
    problem: Missing_Number
    Algorithm: Brute force o(n);
    we will only handle the conditions that satisfies the code by
    trail and error processes.
*/
import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if((nums[i+1]-nums[i])!=1){
                return nums[i]+1;
            }
        }
        if(nums.length>=1){
            if(nums[0]==0){
                return nums[nums.length-1]+1;
            }else if(nums[0]!=0){
                return 0;
            }else{
                return nums[nums.length-1]-1;
            }
        }
        return nums[nums.length-1]+1;
    }
}