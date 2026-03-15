/* 
Given : we are given with an array which are containing numbers with including '0's in "nums" arrays.
Task : we have to move every '0' to last of the array the same array and every non-zero number should be there in the same order so that it shouldn't alter the order of the original array.
My Approach : 1. we have to use one pointer which is used to store every non-sero element into the starting of array.
2. we have to count how many seros are coming.
3. then we have to run seperately another loop from end of the array so that we can add zero's.
*/

//Source Code:
class Solution {
    public void moveZeroes(int[] nums) {
        int left =0;
        int x=nums.length;
        for(int i=0;i<x;i++){
            if(nums[i]!=0){
                nums[left]=nums[i];
                left++;
            }
        }
        while(left<x){
            nums[left]=0;
            left++;
        }
    }
}
