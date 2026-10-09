Question: we have to sort out the numbers which are even in front side of the array and odd numbers of the array in back side of the array

Algorithm: now we have to use two pointers approach for finding the elements which should be swapped and which should be skipped by addressing the conditions like when :
            1. two even numbers came we have to update only left side pointer and leave right side because it may be swap with another element in the left.
            2. two odd numbers came then we have to only update right side pointer.
            3. if one odd and one even number came in opposite directions then we have to swap them and continue.

Source Code:

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            if(((nums[left] & 1)==1)&&((nums[right] &1) ==0)){
                //swapping should be take place and both pointers should be updated;
                int temp =nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }else if(((nums[left]&1)==1)&&((nums[right]&1)==1)){
                //swapping don't take place only the right pointer should be updated;
                right--;
            }else if(((nums[left]&1)==0)&&((nums[right]&1)==0)){
                //swapping don't take place but left pointer only updated;
                left++;
            }else{
                //swapping don't take place but both pointers should be updated;
                right--;
                left++;
            }
        }
        return nums;
    }
}
