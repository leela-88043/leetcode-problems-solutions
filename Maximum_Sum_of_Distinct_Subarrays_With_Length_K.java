/*
    Problem: maximum sum of distinct subarrays with length k
    Algorithm:
    1. we have to use the fixed sliding window concept
    2. we have to insert one by one element in the window and check the 
    condition for it is meeting the exact k elements in the window
    3. we will look for the duplicate elements are present or not
    4. we will update the max_sum of the subarrays.
*/

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int right=0;
        int left=0;
        int sum =0;
        int max_sum=0;
        int count=0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        while(right<nums.length){
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
            sum = sum+nums[right];
            if(freq.get(nums[right])>1){
                count++;
            }
            if(right-left+1>k){
                if(count>=1){
                    if(freq.get(nums[left])>1){
                        count--;
                    }
                }
                freq.put(nums[left],freq.get(nums[left])-1);
                sum = sum-nums[left];
                left++;
            }
            if(sum>max_sum){
                max_sum=sum;
            }
            right++;
        }
        return max_sum;
    }
}