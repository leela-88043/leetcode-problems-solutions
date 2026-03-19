/*
Given : we have given a array nums.
Task : we have to sort the colors without using the sorting algorithms and counting.
Approach : Dutch flag theroy with three pointers.
1. we have to use three pointers to track the array in a way that we can traverse all the elements in a shorter way and sort it
  a. end pointer which is responsible for the 2 number
  b. middle pointer which is responsible for the traversing the elements.
  c. first pointer which is responsible for the 0 element to swap at the starting of the array.
2. for doing the swapping we have to run a loop for this.
*/
//First approach optimal solution considering the space complexity also.
//Source Code:
class Solution {
    public static void swap(int[] arr,int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
    public void sortColors(int[] nums) {
       int first=0,middle=0,end=nums.length-1;
       while(middle<=end){
            if(nums[middle]==2){
                Solution.swap(nums,middle,end);
                end--;
            }else if(nums[middle]==0){
                Solution.swap(nums,middle,first);
                first++;
                middle++;
            }
            else{
                middle++;
            }
       }
    }
}
// 2nd approach
