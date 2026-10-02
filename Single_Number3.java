/*
    Problem: Single Number 3
    we have to find the singly occuring numbers from the
    given array there are only two numbers like that and all other
    numbers we have doubly occuring.

    Algorithm:
    1. we have to find the xor product of two different numbers because we already
    know that other numbers will cancel each other by xorring each other
    2. after the xorring all values we have to select one differing bit by 2's 
    complementing it so that we can find differed bit.
    3. now we have to check and divide all the numbers in the array into two groups
    by checking them with (And) Operation if we get 0 we will shift it into one group
    and others into another group.
    4. now we will xor all the groups individually then we will get two unique
    numbers those are our numbers.
*/

//Source Code:

class Solution {
    public int[] singleNumber(int[] nums) {
        int result =0;
        int[] arr = new int[2];
        for(int i =0;i<nums.length;i++){
            result = result^nums[i];
        }
        int diffBit = result&-result;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&diffBit)==0){
                arr[0]=arr[0]^nums[i];
            }else{
                arr[1]=arr[1]^nums[i];
            }
        }
        return arr;
    }
}