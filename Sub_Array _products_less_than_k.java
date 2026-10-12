/*
    Problem: Sub array products less that k
    Algorithm:
    1. we have to update the product by multiplying.
    2. we have to update the count by every increment in the right.
    3. by right-left+1 because that many possibilities are there.
    4. we have to run a loop for removing the left elements until the 
    product is less that k then repeat the above process.
*/

// Source Code:

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int right=0;
        int left=0;
        int count=0;
        int pro=1;
        if(k<=1){
            return 0;
        }
        while(right<nums.length){
            pro = pro * nums[right];
            while(pro>=k){
                pro/=nums[left];
                left++;
            }
            count+= right-left+1;
            right++;
        }
        return count;
    }
}