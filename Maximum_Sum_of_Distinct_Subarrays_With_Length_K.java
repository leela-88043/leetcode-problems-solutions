
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